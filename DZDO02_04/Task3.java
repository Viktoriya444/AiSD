public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findPairWithSum(numbers, 16);
    }

    public static void findPairWithSum(int[] sortedArray, int targetSum) {
        int leftIndex = 0;
        int rightIndex = sortedArray.length - 1;

        while (leftIndex < rightIndex) {
            int currentSum = sortedArray[leftIndex] + sortedArray[rightIndex];

            if (currentSum == targetSum) {
                System.out.println(sortedArray[leftIndex] + " и " + sortedArray[rightIndex]);
                return;
            }

            if (currentSum < targetSum) {
                leftIndex = leftIndex + 1;
            } else {
                rightIndex = rightIndex - 1;
            }
        }

        System.out.println("ничего :(");
    }
}