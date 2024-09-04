package training.array.problems;

import java.util.ArrayList;

public class CreateArr2 {

    // Method to filter arrayList
    public static void filterArray(ArrayList<Integer> list) {
        for (int number : list) {
            if (number % 3 != 0 || number % 5 != 0) {
                System.out.println(number);
            }
        }
    }

    // Method to create an ArrayList & call the filter method
    public static void processArrayList() {
    	
        // Create an ArrayList 
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        // Call the filter method
        filterArray(list);
    }

    public static void main(String[] args) {
    
        processArrayList();
    }
}
