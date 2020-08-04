package keywords;

//cant use this keyword with var
//using class name directly access member
//all object will share the same memory

public class Static3 {

	public Static3() {
		System.out.println("calling constructor..."); 
	}
	
	static {
		System.out.println("calling static block.."); ////will execute static block 1st
	}

	public static void main(String[] args) {	

		Static3 s3 = new Static3();

	}

}
