//convert string into lower and upper case.

package training.string.problems;

public class ConvertString {

    public static String convertString(String str) {
        String lowerCaseString = str.toLowerCase();
        String upperCaseString = str.toUpperCase();
        return "Lowercase: " + lowerCaseString +
        		", Uppercase: " + upperCaseString;
    }
    
public static void printConvertedString() {
	String inputStr = "Rasba Hozan"; 
	//call the convertString method 
	convertString(inputStr);
	 System.out.println(convertString(inputStr));
}
    public static void main(String[] args) {
    	printConvertedString();     
    }
}
