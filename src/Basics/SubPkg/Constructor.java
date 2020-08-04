package Basics.SubPkg;

import stringsBasics.StringBaseic;

public class Constructor {
   
	public  Constructor() {
		final  int a = 9;
		int b = 2;
		System.out.println(a - b);
	}	
	public  Constructor(int a, int b) {
		System.out.println(a - b);
	}	

	public static void main(StringBaseic args[]) {		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(9, 8); //implicitly or automatically called but method called by explicitly 
	}
}