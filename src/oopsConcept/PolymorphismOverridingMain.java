package oopsConcept;

//same thing which is behaving differently
//Called late or run time binding
//name is same and same signature(argument , datatype) is different 
//Here inheritance is mandatory

public class PolymorphismOverridingMain {
	
	public static void main(String[] args) {
		PolymorphismOverridingChild pov = new PolymorphismOverridingChild();
		pov.add(2, 4);
		pov.div(2, 3);
		pov.mul(3, 4);
		//add of base class will not show
	}
}
