//Perform swapping the number without 3rd var
package Basics.Exercise;

public class Swap1 {
	
	public void swap(int a, int b)
	{
		System.out.println("Before swap \n Value of a "+a+  "\n Value of b " +b);
		 a = a + b ; //1 + 2 = 3 as a
		 b = a - b; // 3 - 1 = 2 as b 
		 a = a - b; // 3 - 2 = 1 as b
		
		System.out.println("After swap \n Value of a "+a+  "\n Value of b " +b);
	}	
	public static void main(String[] args) {
		Swap1 ex = new Swap1();
		ex.swap(6, 2);		
	}
}
