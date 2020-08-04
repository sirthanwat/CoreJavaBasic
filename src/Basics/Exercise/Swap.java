//Perform swapping the number
package Basics.Exercise;

public class Swap {
	
	public int swap(int a, int b)
	{
		System.out.println("Before swap \n Value of a "+a+  "\n Value of b " +b);
	    int temp = a; 
	    a=b;
	    b=temp;
		System.out.println("After swap \n Value of a "+a+  "\n Value of b " +b);
		return (a+b);
	}	
	public static void main(String[] args) {
		Swap ex = new Swap();
		int x= ex.swap(2, 8);
		
	}
}
