package DZ_6;

import java.util.HashSet;

public class Task6 {
    public static void main(String[] args) {
        int[] first = {10, 2, 6, 4, 5};
        int[] second = {7, 4, 5, 6, 7};
        int[] third = {5, 7, 8, 9, 876};

        int result = findNumb(first, second, third);
        System.out.println(result);
    }

    public static int findNumb(int[] f, int[] s, int[] th) {
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < f.length; i++) {
            s1.add(f[i]);
        }

        HashSet<Integer> s2 = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            if (s1.contains(s[i])) {
                s2.add(s[i]);
            }
        }

        for (int i = 0; i < th.length; i++) {
            if (s2.contains(th[i])) {
                return th[i];
            }
        }
        return -1;
    }
}
