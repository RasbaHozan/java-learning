package training.java.emumba;

public class SortArray1 {
public static void main(String[] args) {
	int[] array= {2,5,6,7,0,8,1,3,4};
	for(int i=0;i<array.length-1; i++) {
		for(int j=0;j<array.length-1;j++) {
			if (array[j] > array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	// printing sorted array elements
	for (int i: array) {
		System.out.println(i);
	}
}
}