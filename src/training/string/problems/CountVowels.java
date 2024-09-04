//write a function to count the vowels in a string.

package training.string.problems;

public class CountVowels {
	
  public static int vowelCount(String str) {
    	
        String vowels = "AEIOUaeiou";
        int count = 0;
        
        //iterate through each character of string
        for (int i = 0; i < str.length(); i++) {
           
            boolean vowelFound = false;
            //iterate through each character of vowel string
            for (int j = 0; j < vowels.length(); j++) {
            	 // Check if the current character is a vowel
                if (str.charAt(i) == vowels.charAt(j)) {
               	vowelFound = true;
                }
            }
            if (vowelFound == true) {
            	count++;
            }
        }
        
        return count;
    }
public static void printCount() {
	   String inputStr = "English abcABC";
       System.out.println(vowelCount(inputStr));
}
    public static void main(String[] args) {
     printCount();
    }
}
