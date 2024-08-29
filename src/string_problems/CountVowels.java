//write a function to count the vowels in a string.

package string_problems;

public class CountVowels {
	
  public static int vowelCount(String str) {
    	
        String vowels = "AEIOUaeiou";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Check if the current character is a vowel
            
            for (int j = 0; j < vowels.length(); j++) {
                if (currentChar == vowels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String inputStr = "English abcABC";
        System.out.println(vowelCount(inputStr));
    }
}
