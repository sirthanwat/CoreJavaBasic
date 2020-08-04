package stringsBasics;

//reverse the string with out using reverse function
public class Exersise5 {

	public void reverse(String str1) {
		 char arr[]=str1.toCharArray();
		 for(int i=str1.length()-1; i>=0; i--)
		 {
			 System.out.print(arr[i]);
		 }
	}

	public static void main(java.lang.String[] args) {
		Exersise5 str = new Exersise5();
		str.reverse("hello ");
	}
}
