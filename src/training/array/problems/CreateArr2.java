package training.array.problems;

public class CreateArr2 {
public static void main(String[] args) {
	//initialize the array from 1 to 100
int[] array=new int[100];
for(int i=1; i<array.length;i++) {
	array[i]=i;
}
//print the numbers not divisible by 3 or 5 in array
for(int i : array) {
	if (i%3!=0 || i%5!=0) {
		System.out.println(i);
	}
}
}
}
