//write a function to remove certain character from a string.

package training.string.problems;

public class RemoveChar {
public static String removeChar(String str , char charToRemove){
	String filteredStr="";
	for (int i=0 ;i <=str.length()-1 ; i++) {
		if(str.charAt(i) != charToRemove) {
			filteredStr += str.charAt(i);
		}
}
	return filteredStr;
}

public static void printFilteredStr() {
	String inputStr="my name is Rasba";
	char charToRemove='a';
	System.out.println(removeChar(inputStr,charToRemove));
}

public static void main(String[] args) {
	printFilteredStr();
}
}