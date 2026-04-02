import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4};
        int requiredSum = 10;
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int neededNumber = requiredSum - currentNumber;
            
            if (seenNumbers.contains(neededNumber)) {
                System.out.println("Пара: " + currentNumber + " и " + neededNumber);
                return;
            }
            seenNumbers.add(currentNumber);
        }
        System.err.println("Ничего нет");
    }
}