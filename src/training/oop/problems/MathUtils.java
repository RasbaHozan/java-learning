//"Define a MathUtils class with static methods add() and multiply() to perform basic arithmetic operations without needing an instance.Demonstrate using these static methods."
package training.oop.problems;

public class MathUtils {
    static int x;
    static int y;

    public static void setValues(int x, int y) {
        MathUtils.x = x;
        MathUtils.y = y;
    }
    public static int add() {
        return x + y;
    }

    public static int multiply() {
        return x * y;
    }

    public static void main(String[] args) {
        // Set values using static method
        MathUtils.setValues(2, 5);

        System.out.println("Addition: " + MathUtils.add());
        System.out.println("Multiplication: " + MathUtils.multiply());
    }
}

