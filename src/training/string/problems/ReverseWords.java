//write function to reverse every word of the string
package training.string.problems;

public class ReverseWords {
	
    public static String reverseWords(String str) {
        String revWordStr = "";
        String currentWord = "";

        for (int i = 0; i <= str.length(); i++) {
            // Check if the current character is a space or if it's the end of the string
            if (i == str.length() || str.charAt(i) == ' ') {
                // Reverse the current word 
                for (int j = currentWord.length() - 1; j >= 0; j--) {
                    revWordStr += currentWord.charAt(j);
                }
           //add space
                if (i < str.length()) {
                    revWordStr += ' ';
                }
                // Reset the current word
                currentWord = "";
            } else {
                currentWord += str.charAt(i);
            }
        }
        return revWordStr;
    }
    
    public static void main(String[] args) {
        String inputString = "apple is red";
        System.out.println(reverseWords(inputString));
    }
}
