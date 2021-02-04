package fit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import fit.core.AttendanceHelper;

public class AppTest {

    @Test
    public void shouldGenerateRandomAttendanceList() {
        //arrange
        Map<String, Boolean> attendanceListExpected = new HashMap<>() {{
            put("test one", true);
            put("test two", false);
        }};
        

        //act
        Map<String, Boolean> attendanceListResult = AttendanceHelper.random(2, 50);

        //assert

        //same size (due to parameters sent to random method)
        assertEquals(attendanceListResult.size(), attendanceListExpected.size());

        //same percentile of 'true' values due to parameters sent to random method
        assertEquals(
            countTrueInList(attendanceListExpected.values()),
            countTrueInList(attendanceListResult.values()));
    }

    private int countTrueInList(Collection<Boolean> items) {
        return Math.toIntExact(items.stream().filter(x -> x).count());
    }
}
