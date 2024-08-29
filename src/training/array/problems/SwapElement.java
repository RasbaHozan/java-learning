package training.array.problems;

public class SwapElement {
    public static void main(String[] args) {
        int[] array = {23, 34, 12};
int a = 0;
int b = 2;
        // Swapping elements at position a and b
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}