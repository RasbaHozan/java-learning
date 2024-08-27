package training.java.emumba;

public class ArraySum {

	public static void main(String[] args) {
		int[] array= {1,5,9,3};
		int sum =0;
		for(int i=0; i<array.length;i++) {
			sum += array[i];
		}
System.out.println(sum);
	}
}
