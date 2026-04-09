package DZ_6;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 7;

        int index = linearSearch(array, target);
        System.out.println("Число: " + target + ", его индекс: " + index);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}