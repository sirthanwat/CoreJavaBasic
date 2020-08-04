package stringsBasics;

public class StringBaseic {

	String s = "Aarti";
	String s1 = "Aarti Aarti";
	String s2 = "  Aarti Aarti  ";


	public void stringBaseic() {
		System.out.println("" +s.length());
		System.out.println("" +s1.length());
		System.out.println("" +s2.trim().length());
		System.out.println("" +s1.toLowerCase());
		System.out.println("" +s1.toUpperCase());
	}
	public void stringBaseic1() {
		System.out.println("" +s.charAt(2));	
		//System.out.println("" +s.charAt(6));	//java.lang.StringIndexOutOfBoundsException:		
		System.out.println("" +s1.compareTo(s));	//+v value
		System.out.println("" +s.compareTo(s));	//0
		System.out.println("" +s.compareTo(s1));	//-v value
	}
	public void charArray() {
		char ch[]=s.toCharArray();
		for(char c :ch)
			System.out.println("" +c);	
	}

	public static void main(java.lang.String[] args) {
		// String is class in java
		StringBaseic str = new StringBaseic();
		//str.stringBaseic();
		str.stringBaseic1();
		str.charArray();


	}
}
