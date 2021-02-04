package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
    public static Map<String, Boolean> random(int amount, int percentage) {
        int result = (amount * percentage) / 100;

        Map<String, Boolean> listUser = new HashMap<>();

        for (int i = 0; i < result; i++) {
            listUser.put("user" + i, true);
        }

        for (int i = 0; i < amount - result; i++) {
            listUser.put("userTotal" + i, false);
        }


        return listUser;
    }
}