package oopsConcept;

//Used for hiding data and rule implementation
//two level : class and method
//two types: concrete and abstract
//concrete : method that is declare and define 
//abstract : method only with declaration

public abstract class AbstractionBase { // Concrete class

	public void add() {
		System.out.println("adding nos");
	}

	public abstract void div();

	public abstract void mul();
}
