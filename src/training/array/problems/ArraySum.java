//write a  function to calculate the sum of array elements.

package training.array.problems;
import java.util.ArrayList;
public class ArraySum{
	//method to sum the array elements
	public static int arraySum(ArrayList<Integer> list) {
		int sum=0;
		for (int i =0;i< list.size() ; i++){
			sum += list.get(i);
		}
		return sum;
	}
	//method to create ArrayList
	public static void sumOfArrayList() {
		//create ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
	    list.add(5);
		list.add(3);
		
		 // call the sum method
		int sum= arraySum(list);
		
		//printing output
		System.out.println(sum);
	}
	public static void main(String[] args) {
		//calling the sum method and print the output
		sumOfArrayList();
	}
}