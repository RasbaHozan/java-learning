// write a function to check if the array is palindrome or not.
package training.array.problems;

public class PalindromeCheck {
public static boolean isPalindrome(int[] array) {
	for ( int i=0; i < (array.length/2) ; i++) {
		if (array[i] != array[array.length-1-i]) {
			return false;
		}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array= {2,5,3,2};
		if(isPalindrome(array)) {
			System.out.println("array is palindrome");
		}else {
			System.out.println("array is not a palindrome");
		}
	}
}
