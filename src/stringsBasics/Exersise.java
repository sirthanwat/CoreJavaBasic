package stringsBasics;
//Comparing first 3 chars of strings
public class Exersise {

	public void compare(String str1, String str2) {		
		String s1=str1.substring(0,3);
		String s2=str2.substring(0,3);
		System.out.println(s1+ "***\n" +s2);
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("same");
		else
			System.out.println("not same");
	}
	public static void main(java.lang.String[] args) {
		Exersise str = new Exersise();
		str.compare("hi how are you", "Hello how are you");
	}
}
