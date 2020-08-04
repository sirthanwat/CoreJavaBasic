package oopsConcept;

//Used for hiding data and rule implementation
//two level : class and method
//two types: concrete and abstract
//concrete : method that is declare and define 
//abstract : method only with declaration

public abstract class AbstractionMain { //abstract class
	
	public static void main(String[] args) {
		AbstractionChild ab = new AbstractionChild();
		ab.add();
		ab.div();
		ab.mul();
	}
}
