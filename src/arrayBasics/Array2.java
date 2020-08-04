package arrayBasics;

public class Array2 {

	
	public void twodimensional1() {
	    //Two dimensional array
	     int [][] arr1= new int[2][3];     
	     System.out.println(arr1[0][1]=11);
	     System.out.println(arr1[1][1]=12);
			for (int i=0; i<=arr1.length-1; i++)
	     for (int j=0; j<3; j++){
		     System.out.print(arr1[i][j] +" ");
	     }
			 System.out.println("");
		}
	public void iterate(){
	     int [][] arr2={{2,3,4},{1, 5, 6}};
		for (int i=0; i<=arr2.length-1; i++)
			for (int j=0; j<3; j++)
			     System.out.println(arr2[i][j]);
	}

	public static void main(java.lang.String[] args) {
		Array2 a = new Array2();
		//a.iterate();
		a.twodimensional1();
	}
}
