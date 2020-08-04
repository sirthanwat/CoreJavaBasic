package oopsConcept;

//Used for hiding data and rule implementation
//two level : class and method
//two types: concrete and abstract
//concrete : method that is declare and define 
//abstract : method only with declaration

public class AbstractionChild extends AbstractionBase { // Concrete class

	@Override
	public void mul() {
		System.out.println("multiplication....");
	}

	@Override
	public void div() {
		System.out.println("division....");

	}
}
