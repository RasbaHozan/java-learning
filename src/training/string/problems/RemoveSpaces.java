//write a function to remove spaces from string
package training.string.problems;

public class RemoveSpaces {
public static String removeSpaces(String str){
	String filteredStr="";
	for (int i=0 ;i <=str.length()-1 ; i++) {
		if(str.charAt(i) != ' ') {
			filteredStr += str.charAt(i);
		}
}
	return filteredStr;
}
public static void main(String[] args) {
	String inputStr="my name is Rasba";
	
	System.out.println(removeSpaces(inputStr));
}
}
