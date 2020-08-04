package arrayBasics;

//largest value
public class EvenNoFind {
	;
	int count = 0;

	public void onedimensional(int x) {
		// one dimensional array
		int[] arr = { 1, 2, 30, 12, 19, 18, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0)
				System.out.println("no is even :" +arr[i]);
			else
				System.out.println("no not even " +arr[i]);
		}
			
	}

	public static void main(java.lang.String[] args) {
		EvenNoFind a = new EvenNoFind();
		a.onedimensional(1);// how many times it exist count
	}
}
