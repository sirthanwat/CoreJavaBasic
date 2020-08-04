package oopsConcept;

public interface InterfaceBase {
	
	//only constant 
	
	  int i=10;
	
	public static void getStatic() //java 8
	{
		System.out.print("getStatic....");
	}
	public default void getDefault() //java 8
	{
		System.out.println("getDefault....");
	}
	
	public void getData();

}
