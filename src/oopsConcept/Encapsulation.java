package oopsConcept;

//wrapping data and fun in single unit : class support this in java

public class Encapsulation {

	// whatever var will create inside class that should be private
	// that will be accessible by getter and setter in other calss

	//called data hiding : hidden from other classes
	private int id;
	private String name;

	// setting value of global var
	public void setId(int id) {
		this.id = id;
	}

	// getting value of global var
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getString() {
		return name;
	}
	
	public static void main(String[] args) {

		Encapsulation ecp = new Encapsulation();
		ecp.setId(100);
		System.out.println(ecp.getId());
		System.out.println(ecp.getString());
	}
}
