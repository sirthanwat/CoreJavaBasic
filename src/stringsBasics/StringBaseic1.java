package stringsBasics;

public class StringBaseic1 {

	String s = "Aarti";
	String s1 = "AartiaAarti";
	String s2 = "Hanwat";

	public void stringBaseic() {
		System.out.println("" +s.replace("Aar", "Tir"));
		System.out.println("" +s.replace("ti", "oye"));
		System.out.println("" +s.replace("a", "o"));
		System.out.println("" +s.replace("a", "gaurav"));
		System.out.println("" +s.replace("a", ""));
	}	
	public void charCount() {
		System.out.println("" +s1.length());
		System.out.println("***" +(s1.length()  -  s1.replace("a", "").length()));
	}

	public void concatinate() {
		System.out.println("con  :" +s+s2);
		System.out.println("con  :" +s+ " " +s2);
		System.out.println("con  :" +s.concat(" ").concat(s2));
	}
	
	public void subString() {
		System.out.println("subString  :" +s1.substring(2));
		System.out.println("subString  :" +s1.substring(2, 7));

	}
	public static void main(java.lang.String[] args) {
		StringBaseic1 str = new StringBaseic1();
		//str.stringBaseic();
		//str.charCount();
		//str.concatinate();
		str.subString();

	}
}
