// write a function to count the occurrence of character in a string.

package training.string.problems;

public class CountChar {

public static int countChar(String str,char charToCount) {
	int count=0;
	for (int i=0; i<str.length();i++) {
		if ( str.charAt(i)==charToCount) {
			count++;
		}
	}
	return count;
}
public static void main(String[] args) {
	String inputStr="my name is Rasba";
	char character='m';
	System.out.println(countChar(inputStr,character));
}
}
