package training.array.problems;

public class EqualArrays {

    public static boolean equalArrays(int[] array1, int[] array2) {
        // Check if arrays are of the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Compare elements 
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 5};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3,4};

        System.out.println("Array1 and Array2 are equal: " + equalArrays(array1, array2));
        System.out.println("Array2 and Array3 are equal: " + equalArrays(array2, array3));

    }
}
