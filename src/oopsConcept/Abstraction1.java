package oopsConcept;

//Used for hiding data and rule implementation
//two level : class and method
//two types: concrete and abstract
//concrete : method that is declare and define 
//abstract : method only with declaration

public abstract class Abstraction1 { //abstract class

	public void display1()
	{
		System.out.print("Concrete class");
	}
	public abstract void display(String str); // we can force someone to create same architature and ask him to inherite my class
	
	
	public static void main(String[] args) {
		//Abstraction1 ab = new Abstraction1(); // cant create the object of abstract class
		
	}

}
