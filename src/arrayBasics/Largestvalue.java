package arrayBasics;

//largest value
public class Largestvalue {
	int max = 0;

	public void onedimensional() {
		// one dimensional array
		int[] arr = { 1, 2, 30, 12, 190, 18 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - 1; j++) {

				if (arr[i] > arr[j]) {
					max = arr[i];
					System.out.println("max...i: " + max);
				} else if (arr[i] < arr[j]) {
					max = arr[j];
					if (max > arr[j])
						System.out.println("max...j: " + max);
					else {
						max = arr[j];
						System.out.println("max...j: " + max);
					}
				}
			}
		}
		System.out.println("max...value: " + max);
	}

	public static void main(java.lang.String[] args) {
		Largestvalue a = new Largestvalue();
		a.onedimensional();
	}
}
