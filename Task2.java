public class Task2 {
    public static int poiskChislo(int[] arr) {
        int k = arr.length;
        int allSum = k * (k + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < k; i++) {
            actualSum = actualSum + arr[i];
        }
        return allSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        int missing = findMissingNumber(arr);
        System.out.println("Пропущенное число: " + missing);
    }
}