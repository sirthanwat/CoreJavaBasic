package oopsConcept;

public class InheritanceMain {

	public static void main(String[] args) {
		
		//Single level
		InheritanceChild ch = new InheritanceChild(); //child object can access method of parent class
		ch.mul(10, 2);
		
		// parent method
		ch.add(2, 3);
		ch.sub(3, 2);
		
		InheritanceParent par = new InheritanceParent(); //parent object can access method of parent class
		par.add(2, 8);
		par.sub(3, 1);
		//par.mul // parent cant access child method
		
		//Multilevel
		InheritanceChildOfChild chch = new InheritanceChildOfChild(); //parent object can access method of parent class
		chch.mul(2, 8);
		chch.multilevel();
		chch.add(10, 1);
		
		//Multilevel
		InheritanceChildOfChild1 chch1 = new InheritanceChildOfChild1(); //parent object can access method of parent class
		chch1.multilevel1();
		chch1.add(10, 1);

	}
}

// adv : reduse duplicate code

//single level : a--> b 
//Multi level : a--> b ---> c
//Hierarchical level a --- b
//                    :
  //                  :
  //                  c	 
