package oopsConcept;

//same thing which is behaving differently
//Called early or compile binding
//name is same but signature(argument , datatype) is different 

public class PolymorphismOverloading {

	/*Exp :
		Assert.assertEquals(arg1, arg2);
        Assert.assertEquals(arg1, arg2, msg);
        // in java
        subString(2);
        subString(2,3)
        */
	
	public void sub(int a, int b)
	{
		System.out.print(a-b);		
	}

	//not consider as overloadinhg
	/*public int sub(int a, int b)
	{
      return a+b;		
	}*/
	public void sub(int a, int b, int c)
	{
		System.out.print(a-b -c);		
	}
	
	public void sub(int a, float b)
	{
		System.out.print(a-b);		
	}
	
	public void sub(float a, int b)
	{
		System.out.print(a-b);		
	}
	public static void main(String[] args) {
		PolymorphismOverloading pov = new PolymorphismOverloading();
		pov.sub(2, 2.3f);
	}
}
