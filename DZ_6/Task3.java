package DZ_6;

public class Task3 {
    public static void main(String[] args) {
        String input = "I love ITIS";

        String result = reverseWords(input);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
