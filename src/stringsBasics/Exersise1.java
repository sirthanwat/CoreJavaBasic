package stringsBasics;
//Comparing last 10 chars of strings
public class Exersise1 {

	public void compare(String str1, String str2) {		
		String s1=str1.substring(str1.length()-10);
		String s2=str2.substring(str2.length()-10);
		System.out.println(s1+ "***\n" +s2);
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("same");
		else
			System.out.println("not same");
	}
	public static void main(java.lang.String[] args) {
		Exersise1 str = new Exersise1();
		str.compare("hi how are you", "Hello how are you");
	}
}
