package arrayBasics;

//largest value
public class DecendingOrder {

	public void onedimensional() {
		// one dimensional array
		int temp=0;
		int i;
		int[] arr = { 1, 2, 30, 12, 19, 18 };
		for ( i = 0; i < arr.length; i++) {
			for (int j = i+1; j <= arr.length-1; j++) {

				if (arr[i] < arr[j]) {
                  temp = arr[i]; 
                  arr[i]=arr[j];
                  arr[j]=temp;				
				}
			}
			System.out.println(arr[i]);
		}
	}

	public static void main(java.lang.String[] args) {
		DecendingOrder a = new DecendingOrder();
		a.onedimensional();
	}
}
