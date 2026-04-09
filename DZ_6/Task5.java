package DZ_6;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        int clSum = findSum(arr, target);
        System.out.println("Сумма, ближайшая к " + target + ": " + clSum);
    }

    public static int findSum(int[] array, int targ) {
        Arrays.sort(array);
        int size = array.length;
        int mySum = array[0] + array[1] + array[2];

        for (int i = 0; i < size - 2; i++) {
            int left = i + 1;
            int right = size - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if (Math.abs(targ - currentSum) < Math.abs(targ - mySum)) {
                    mySum = currentSum;
                }

                if (currentSum < targ) {
                    left = left + 1;
                } else if (currentSum > targ) {
                    right = right - 1;
                } else {
                    return currentSum;
                }
            }
        }
        return mySum;
    }
}