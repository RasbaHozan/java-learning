package training.java.emumba;

public class CheckPrime {
    public static boolean isPrime(int num) {
    	boolean a =true;
    	boolean b = false;
        if (num <= 1) {
            return b;
        }
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return b;
            }
        }
        return a;
    }

    // Main method to check the isPrime method
    public static void main(String[] args) {
        int num = 109;
        if (isPrime(num)) {
            System.out.println(" prime number.");
        } else {
            System.out.println("not a prime number.");
        }
    }
}
