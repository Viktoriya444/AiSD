import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 5, 3, 2};
        formLargestNumber(numbers);
    }

    public static void formLargestNumber(int[] digits) {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < digits.length; i++) {
            strings.add(String.valueOf(digits[i]));
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return (second + first).compareTo(first + second);
            }
        });

        if (strings.get(0).equals("0")) {
            System.out.println("0");
            return;
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
        }
        System.out.println();
    }
}