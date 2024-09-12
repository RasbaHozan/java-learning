// find largest word in string.
package training.string.problems;

public class LargestWord {
public static String largestWord(String str) {
	
String largestWord="";
String word="";

for (int i=0; i<str.length();i++) {
	
	char character =str.charAt(i);
	if (character == ' ') {
		if ( word.length() > largestWord.length()) {
			largestWord = word;
		}
		word=""; //resetting word 
	} else {
		word += character; 
	}
}

if ( word.length() > largestWord.length()){
       largestWord=word;
}

return largestWord;
}

public static void main (String[] args) {
	String inputStr="this is a interview";
	System.out.println(largestWord(inputStr));
}
}
