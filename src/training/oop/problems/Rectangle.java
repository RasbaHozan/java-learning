//Write a Java program to create a class Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables. 

package training.oop.problems;

public class Rectangle {
private int length;
private int width;
//constructor
public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
}
//getter and setter
public int getLength(){
	return length;
}
public void setLength(int newLength) {
	this.length=newLength;
}
public int getWidth(){
	return width;
}
public void setWidth(int newWidth) {
	this.length=newWidth;
}
public static void main (String[] args) {
	Rectangle rect1=new Rectangle(9,7);

	System.out.println(rect1.getLength());
	System.out.println(rect1.getWidth());
}
}
