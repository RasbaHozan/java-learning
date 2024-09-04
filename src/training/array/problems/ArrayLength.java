//write a function to find the length of array
package training.array.problems;

import java.util.ArrayList;

public class ArrayLength {
	
public static int arrayLength(ArrayList<Integer> list) {
	// getting the length of ArrayList
   return list.size();
	}

public static void lengthArrayList() {
	//create ArrayList
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(3);
	list.add(5);
	list.add(9);
	
	//call length method
	arrayLength(list);
	
	//printing output
	System.out.println(arrayLength(list));
}

public static void main(String[] args) {
	lengthArrayList();
}
}