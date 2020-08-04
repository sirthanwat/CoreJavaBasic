package arrayBasics;

public class Array1 {

	public void twodimensional() {
    //Two dimensional array
     int [][] arr1={{2,3,4},{1, 5, 6}};
     System.out.println("len "+arr1.length);
     System.out.println(arr1[0][1]);
     System.out.println(arr1[1][1]);
	}	

	public static void main(java.lang.String[] args) {
		Array1 a = new Array1();
		a.twodimensional();
	}
}
