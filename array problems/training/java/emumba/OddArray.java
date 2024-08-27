package training.java.emumba;

public class OddArray{
public static void main(String[] args) {
	//initializing the array
	int[] array= new int[101];
	for(int i=0; i <= 100; i++){
		array[i]=i;
		}
	//printing array
for (int i : array)	{
		if (i%2 != 0) {
			System.out.println(i);
		}
	}
}
}
