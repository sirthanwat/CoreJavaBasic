package keywords;

//cant use this keyword with var
//using class name directly access member
//all object will share the same memory

public class Static1 {
     static int i;
      int j=0;
	
 
	public static void main(String[] args) {

		Static1 s = new Static1();
		s.i = 10;
		System.out.println("value of i.." +s.i);	//10
		Static1 s1 = new Static1();
		s1.i = 10 +i;
		System.out.println("value of i.." +s1.i);	//20 (shared object )

		Static1 s2 = new Static1();
		s2.j = 10;
		System.out.println("value of j.." +s2.j);	//10 (each time it will create the memory)
		
		Static1 s3 = new Static1();
		System.out.println("value of j.." +s3.j); //0

	}

}
