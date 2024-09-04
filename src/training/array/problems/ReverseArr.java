// write function to reverse the array 
package training.array.problems;

public class ReverseArr {

    public static int[] reverseArray(int[] array) {
        // Initialize a new array
        int[] revArray = new int[array.length];

        // Reverse the array
        for (int i = 0; i < array.length; i++) {
            revArray[i] = array[array.length - 1 - i];
        }
        return revArray;
    }

    // Method to print array elements in a single line
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 5, 7};
        printArray(reverseArray(inputArray));
    }
}
