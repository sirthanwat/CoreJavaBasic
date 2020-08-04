package Basics;

//bigger data type value is transfered to smaller datatype
public class ExplicitDataType {

	public static void main(String[] args) {

		byte b= 8; //1 byte
		short s; //2 byte
		int i=10; //4 byte
		long l; //8 byte
		
		
		b = (byte) i; //ExplicitDataType :  manually need to do
		
		// string to int 
        String st ="500";
        int j = Integer.parseInt(st);
		System.out.println(j/10);
		
		// int to string 
		
		int x = 1000;
		String s1= String.valueOf(x);
		System.out.print(s1.length());

	}

}
