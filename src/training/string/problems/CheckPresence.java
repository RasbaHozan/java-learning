
package training.string.problems;

public class CheckPresence{
    public static boolean checkWordPresence(String str, String substring) {
        int strLength = str.length();
        int subLength = substring.length();
        
        if (subLength == 0) return true;
        for (int i = 0; i <= strLength - subLength; i++) {
            boolean found = true;
            
            // Check if substring matches starting from index i
            for (int j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return true;
            }
        }
        // If no match is found, return false
        return false;
    }

    public static void main(String[] args) {
        String str = "my name is rasba";
        String substring = "rasba";
        boolean isPresent = checkWordPresence(str, substring);

        System.out.println( isPresent);
    }
}
