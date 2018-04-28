package panagram;

import java.util.HashMap;

public class Panagram {
    public boolean isPanagram(String toTest) {
        HashMap<Character, Boolean> testMap= new HashMap<>();

        for (char c: toTest.toLowerCase().toCharArray()) {
            testMap.put(c, true);
        }

        for (char c= 'a'; c <= 'z'; c++) {
            if (!testMap.containsValue(c)) {
                return false;
            }
        }

        return true;
    }
}
