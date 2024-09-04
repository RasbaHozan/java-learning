package training.array.problems;

public class SortArray2 {

    // Method to sort the array in descending order
    public static void sortArray2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 88, 55};

        // Print original array
        System.out.print("Original array: ");
        printArray(array);

        // Call sorting method on array
        sortArray2(array);

        // Print sorted array
        System.out.print("Sorted array: ");
        printArray(array);
    }
}
