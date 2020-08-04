package oopsConcept;

//same thing which is behaving differently
//Called late or run time binding
//name is same and same signature(argument , datatype) is different 
//Here inheritance is mandatory

public class PolymorphismOverridingBase {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);		
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);		
	}
}
