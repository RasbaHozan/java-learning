//write function to split string on the basis of length.
package training.string.problems;

import java.util.ArrayList; 

public class SplitString {

    public static String[] splitString(String str, int splitLength) {
        ArrayList<String> list = new ArrayList<>();  
        String substring = "";
        
        for (int i = 0; i < str.length(); i++) {
            substring += str.charAt(i);
            if (substring.length() == splitLength) {
                list.add(substring);
                substring = "";  
            }
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
    	   String inputStr = "my name is rasba";
           int splitLength = 4;
           String[] array = splitString(inputStr, splitLength);
           for (int i = 0; i < array.length; i++) {
               System.out.println(array[i]);
    }
    }}
