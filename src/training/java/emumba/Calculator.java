package training.java.emumba;

public class Calculator {
public static void main(String[] args) {
	int a = 3 ;
	int b = 9;
	String operation ="*";
	int c;
	if (operation == "+") {
		c=a+b;
		System.out.println(c);
	} else if (operation =="-") {
		c=a-b;
		System.out.println(c);
	} else if (operation == "*") {
		c=a*b;
		System.out.println(c);
	}
}
}
