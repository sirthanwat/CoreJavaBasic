package Basics.SubPkg;

import stringsBasics.StringBaseic;

public class Constructor1 {
   
	public  Constructor1() {
		final  int a = 16;
		int b = 2;
		System.out.println(a - b);
	}	
	
	
	public  void testing(int a, int b) {
		System.out.println(a - b);
	}	

	public static void main(StringBaseic args[]) {		
		Constructor1 obj = new Constructor1();
		obj.testing(10, 8);
		Constructor1 obj1 = new Constructor1();
		Constructor1 obj2 = new Constructor1();
		Constructor1 obj3 = new Constructor1();// how many object will create it will be called that many times 
	}
}