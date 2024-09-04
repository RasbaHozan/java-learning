//write function to create an array of odd numbers from 1 to 100
package training.array.problems;

public class OddArray {
    public static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
    public static void printOddNumbers(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = initializeArray(101); 
        printOddNumbers(array);          
    }
}
