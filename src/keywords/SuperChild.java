package keywords;

public class SuperChild extends Super{
   
	int i =20; // global 
	public void test()
	{
		int i = 30; //local
		System.out.println("value of loacl var \"i\".." +i);
		System.out.println("value of global var \"i\".." +this.i); 
		System.out.println("value of parent var \"i\".." +super.i);  //using super we can access variable of parent class 
	}
	public void callingTest()
	{
		System.out.println("calling same class method using this...");
		this.test(); //calling same class method using this
		System.out.println("calling parent class method using super...");//overriding is present
		super.test();
	}
	
	public static void main(String[] args) {
		SuperChild ch = new SuperChild();
		ch.test();
		ch.callingTest();
	}

}
