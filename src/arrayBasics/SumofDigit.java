package arrayBasics;

//sum of digit in array
public class SumofDigit {
    int sum=0;

	public void onedimensional() {
		// one dimensional array
		int[] arr = { 1, 2, 3 };
		for (int i : arr) {
         sum = sum + i;
         System.out.println(i);
		}
        System.out.println("sum..." +sum);

	}

	public static void main(java.lang.String[] args) {
		SumofDigit a = new SumofDigit();
		a.onedimensional();
	}
}
