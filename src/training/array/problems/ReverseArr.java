package training.array.problems;

public class ReverseArr {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5};
        int[] revArray = new int[array.length];

        // Reverse the array
        for (int i = 0; i < array.length; i++) {
            revArray[i] = array[array.length - 1 - i];
        }
        System.out.print(revArray);
    }
}
