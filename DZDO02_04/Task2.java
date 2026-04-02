import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[] inputStrings = new String[]{"Святослав", "Игнатий", "Джамиля"};
        System.out.println(sortStrings(inputStrings));
    }

    public static List<String> sortStrings(String[] stringArray) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            stringList.add(stringArray[i]);
        }

        stringList.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                if (first.equals(second)) return 0;

                int minLength = Math.min(first.length(), second.length());
                for (int j = 0; j < minLength; j++) {
                    if (first.charAt(j) != second.charAt(j)) {
                        return first.charAt(j) - second.charAt(j);
                    }
                }
                return first.length() - second.length();
            }
        });

        return stringList;
    }
}