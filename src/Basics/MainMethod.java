package Basics;

class MainMethod {
	
	public static void main(String args[]) {
		/*Object obj = new Object();
		obj.sub();
		obj.add();
		
		Object2 obj1 = new Object2();
		obj1.mul();	
		obj1.mul1(10, 20);	*/		
		
		resusableM obj2 = new resusableM();
		int c = obj2.adding(10, 5);	
		obj2.mul1(c, 2 );	
		int x= obj2.xReturn();
		System.out.println("returning x :" +x);
		
		PublicAccessModifierClass am = new PublicAccessModifierClass();
		am.testPublic();// will access throughout the project
		//obj1.testPrivate(); //will not be visible , access within class only
		am.testDefault(); // access within same pkg only it will be accessible ...called pkg modifier also
	    am.testProtected();//access within same pkg
	}
}