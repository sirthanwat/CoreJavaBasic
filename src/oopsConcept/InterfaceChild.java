package oopsConcept;

public class InterfaceChild extends InterfaceBase1 implements InterfaceBase {

	@Override
	public void getData() {
		System.out.println("getData....");
	}

	public static void main(String[] args) {
		InterfaceChild ch = new InterfaceChild();
		ch.getData();
		System.out.print("int...." +ch.i);
		ch.getDefault();  // called bye child class obj java 8
		InterfaceBase.getStatic();		//called by interface name java 8
		ch.getData1();
		

	}

	//multiple and hybrid inheritance using interface
}
