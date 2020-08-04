package keywords;

//cant use this keyword with var
//using class name directly access member
//all object will share the same memory
//instance method can access any variable (static or instance)
//static block and constructor both will call if will create object of class 
//will execute static block 1st bcoz while loading the memory it will call
// when class loaded successfully then object will create so ...

public class Static {
    
	static int i =20 ;
	public static void test1()
	{
		System.out.println("static method 1..." +i);
	}
	public static void test()
	{
		i=10;
		System.out.println("static method ..." +i);
	}
	
	public static void main(String[] args) {

		Static.test();	
		
		Static.test1();	
		Static.i=100;
		System.out.println(" int var ..."+i);

	}

}
