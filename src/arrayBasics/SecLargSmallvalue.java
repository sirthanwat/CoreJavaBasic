package arrayBasics;

//largest value
public class SecLargSmallvalue {
;

	public void onedimensional() {
		// one dimensional array
		int[] arr = { 1, 2, 30, 12, 19, 18 };
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < arr.length - 1; i++) 
		{
			if(max1<arr[i]){
				max2=max1;
				max1= arr[i];
			}
			else if (max2<arr[i])
				max2= arr[i];

		}
		System.out.println("Largest Number in a given array is : " + max1);
		System.out.println("2nd Largest Number in a given array is : " + max2);
	}

	public static void main(java.lang.String[] args) {
		SecLargSmallvalue a = new SecLargSmallvalue();
		a.onedimensional();
	}
}
