package arrayBasics;

public class Array {

	public void onedimensional() {
		//one dimensional array
    int [] arr = {1, 2, 3};
    System.out.println(arr.length);
    System.out.print(arr[0]);
    System.out.print(arr[1]);
    System.out.println(arr[2]);
	}
	
	public static void main(java.lang.String[] args) {
		Array a = new Array();
		a.onedimensional();

	}

}
