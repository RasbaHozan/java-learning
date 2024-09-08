package training.string.problems;
import java.util.ArrayList;
import java.util.List;

public class SplitString2 {

    // Function to split the string into arrays based on a character
    public static String[][] splitStrToArrays(String str, char ch) {
        List<String[]> resultList = new ArrayList<>();
        
        String substring = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                    resultList.add(new String[] { substring });
                    substring = "";
                }
             else {
                substring += str.charAt(i); 
            }
        }
        // Add the last substring if it is not empty
        if (!substring.isEmpty()) {
            resultList.add(new String[] { substring });
        }
        
        // Convert the list of arrays to an array of arrays
        String[][] resultArray = new String[resultList.size()][];
        resultList.toArray(resultArray);
        
        return resultArray;
    }

    public static void main(String[] args) {
        String str = "my name is rasba";
        char ch = 'a';
        String[][] resultArray = splitStrToArrays(str, ch);
        for (String[] array : resultArray) {
            System.out.println("[" + array[0] + "]");
        }
    }
}