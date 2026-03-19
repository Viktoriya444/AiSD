public class Task1 {
    public static boolean findShift(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String doubled = s1 + s1;
        for (int i = 0; i <= doubled.length() - s2.length(); i++) {
            if (doubled.startsWith(s2, i)) return true;
        }
        return false;
    }
}