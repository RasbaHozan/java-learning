package training.oop.problems;

public class MathUtils {
int x;
int y;
MathUtils(int x ,int y ){
	this.x=x;
	this.y=y;
}
 public int add() {
	return this.x+this.y;
}
 public int multiply() {
	 return this.x* this.y;
 }
 public static void main ( String[] args) {
	 int x=2;
	 int y=5;
	 MathUtils mathUtils=new MathUtils(x,y);
	 System.out.println("addition:" + mathUtils.add());
	 System.out.println("multiplication:" + mathUtils.multiply());
 }
}
