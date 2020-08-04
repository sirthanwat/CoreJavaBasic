package oopsConcept;

//same thing which is behaving differently
//Called late or run time binding
//name is same and same signature(argument , datatype) is different 
//Here inheritance is mandatory

public class PolymorphismOverridingChild extends PolymorphismOverridingBase {
	
	//Same as pareent but need to change the logic or enhance the code
	public void add(int a, int b)
	{
		System.out.println(a*a+b);	//changing code	
	}
	public void div(int a, int b)
	{
		System.out.println(a/b);		
	}	
}
