package training.string.problems;

public class ConvertString {

    public static String convertString(String str) {
        String lowerCaseString = str.toLowerCase();
        String upperCaseString = str.toUpperCase();
        return "Lowercase: " + lowerCaseString +
        		", Uppercase: " + upperCaseString;
    }

    public static void main(String[] args) {
        String inputStr = "Rasba Hozan";    
        System.out.println(convertString(inputStr));
    }
}
