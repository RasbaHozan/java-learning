//write function to reverse the string elements of array.
package training.string.problems;

public class ReverseArrayElements {

    // Method to reverse each element of the array
    public static String[] reverseElements(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String reversedStr = "";
            
            // Reverse the string
            for (int j = str.length() - 1; j >= 0; j--) {
                reversedStr += str.charAt(j);
            }
            // Update the array with the reversed string
            arr[i] = reversedStr;
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] inputArray = {"book", "car"};
        // Reverse each element in the array
        String[] reversedArray = reverseElements(inputArray);
        
        // Print the reversed array
        for (String str : reversedArray) {
            System.out.println(str);
        }
    }
}
