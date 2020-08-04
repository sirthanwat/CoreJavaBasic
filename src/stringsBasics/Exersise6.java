package stringsBasics;

//palendrome or not 
public class Exersise6 {
	char str2;
	String str="";
	public void reverse(String str1) {
		char arr[] = str1.toCharArray();
		for (int i = str1.length() - 1; i >= 0; i--) {
			str =  str + arr[i];	
			System.out.println(str);
			if (str.equals(str1))
				System.out.println("palendrome");
		}
	}

	public static void main(java.lang.String[] args) {
		Exersise6 str = new Exersise6();
		str.reverse("ara");
	}
}
