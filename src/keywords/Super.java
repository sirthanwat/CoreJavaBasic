package keywords;

//calling super class constructor : 
// a: default constructor will call automatically for both class
//b: paramete constructor for base class will call using super keyword will call explicitly from child class

//super we can access variable of parent class
//calling parent class method using super...");//overriding is present

public class Super {

	int i = 10;

	public void test() {
		int i = 30; // local
		System.out.println("value of loacl var \"i\".." + i);
		System.out.println("value of global var \"i\".." + this.i);
		// System.out.println("value of parent var \"i\".." +super.i); //using
		// super we can access variable of parent class
	}
}
