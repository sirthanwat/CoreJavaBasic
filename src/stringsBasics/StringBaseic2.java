package stringsBasics;

public class StringBaseic2 {

	String s = "Aarti";
	String s1 = "AartiaAarti";
	String s2 = "Hanwat";
	String str = "Aaarti is the best girl";
	
	public void contains() {
		if(s.contains(s1))
			System.out.println("found");
		else if(s1.contains(s))
			System.out.println("found");
		else 
			System.out.println("not found");			
	}
	public void split() {
		String st[]=str.split(" ");
		for(String st1 : st)
		System.out.println("**" +st1);
		///
		String st0[]=str.split("#");
		for(String st_0 : st0)
		System.out.println("**" +st_0);//return one string 
	}	
	public static void main(java.lang.String[] args) {
		StringBaseic2 str = new StringBaseic2();
		str.contains();
		str.split();

	}
}
