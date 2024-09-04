//write a function to swap elements at position a and b.
package training.array.problems;

public class SwapElement {
	
    public static void swapElements(int[] array, int a, int b) {
   
        // Swapping elements at position a and b
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {23, 34, 12};
        int a = 0;
        int b = 2;

        // Call the swapElements method
        swapElements(array, a, b);

        // Print the array after swapping
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
