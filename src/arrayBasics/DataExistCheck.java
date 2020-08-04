package arrayBasics;

//largest value
public class DataExistCheck {
	;
	int count = 0;

	public void onedimensional(int x) {
		// one dimensional array
		int[] arr = { 1, 2, 30, 12, 19, 18, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				count++;

		}
		if (count > 0)
			System.out.println("data is present and count is:" + count);
		else
			System.out.println("data not present :" + count);
	}

	public static void main(java.lang.String[] args) {
		DataExistCheck a = new DataExistCheck();
		a.onedimensional(1);// how many times it exist count
	}
}
