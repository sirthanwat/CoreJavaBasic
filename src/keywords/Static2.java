package keywords;

//cant use this keyword with var
//using class name directly access member
//all object will share the same memory

public class Static2 {
	static int i=10;
	int j = 0;

	public void instanceMethod() {
		System.out.println("static var of i.." + i); 
		System.out.println("instance var value of j.." + j); 
	}
	
	//static method cant access instance member/var
	public static void staticMethod() {
		System.out.println("static var of i.." + i); 
		//System.out.println("instance var value of j.." + j); //cant access 
	}

	public static void main(String[] args) {	

		Static2 s3 = new Static2();
		s3.instanceMethod();

	}

}
