package panagram;

public class Panagram {
    public static boolean isPanagram(String toTest) {
        boolean[] checkArray= new boolean['z' + 1];

        for (char c: toTest.toLowerCase().toCharArray()) {
            checkArray[c] = true;
        }

        for (char c= 'a'; c <= 'z'; c++) {
            if (!checkArray[c]) {
                return false;
            }
        }

        return true;
    }
}
