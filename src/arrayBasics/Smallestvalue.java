package arrayBasics;

//largest value
public class Smallestvalue {
;

	public void onedimensional() {
		// one dimensional array
		int[] arr = { 1, 2, 30, 12, 19, 18 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) 
		{
			if(arr[i]>max)
				max= arr[i];
			if(arr[i]<min)
				min= arr[i];
		}
		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}

	public static void main(java.lang.String[] args) {
		Smallestvalue a = new Smallestvalue();
		a.onedimensional();
	}
}
