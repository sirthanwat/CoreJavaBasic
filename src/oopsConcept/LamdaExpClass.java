package oopsConcept;


//Java 8 feature
//anonymous fun (not belong to class and not having name): create using funtional interface
public class LamdaExpClass {

	public static void main(String[] args) {

		LamdaExp obj =(a, b)-> a+b;
		int x =obj.sum(100, 200);
		
		System.out.print(x);
		
	}

}
