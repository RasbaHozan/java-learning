//write a function to reverse the whole string
package string_problems;

public class ReverseString {
public static String reversedString(String str) {
	String reversedStr="";
	for(int i=str.length()-1;i>=0;i--) {
		reversedStr += str.charAt(i);
	}
	return reversedStr;
}
public static void main(String[] args) {
	String inputStr= "my name is rasba";
	System.out.println(reversedString(inputStr));
}
}
