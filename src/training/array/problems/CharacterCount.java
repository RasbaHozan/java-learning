//write a function to count the character occurrence.
package training.array.problems;

public class CharacterCount {
public static int characterCount(String[] array, char characterToCount ) {
	
	int count=0;
	
	for (int i=0; i< array.length ; i++) {
		String word = array[i];
		
		for (int j=0; j< word.length(); j++) {
			if (word.charAt(j) == characterToCount) {
				count++;
			}
		}
	}
	return count;
}

public static void main(String[] args) {
	String[] inputArray={"pick", "son", "arrayString"};
	char characterToCount='n';
	characterCount(inputArray,characterToCount);
	System.out.println(characterCount(inputArray,characterToCount));
}
}
 