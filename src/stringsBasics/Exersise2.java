package stringsBasics;

//update 1st word in small, 2nd word in capital, 3rd word in small
public class Exersise2 {

	public void update(String str1) {
		String s1[] = str1.split(" ");
		for (int i = 0; i < s1.length; i++)
			if (i % 2 == 0)
				System.out.println(s1[i].toLowerCase());
			else
				System.out.println(s1[i].toUpperCase());
	}

	public static void main(java.lang.String[] args) {
		Exersise2 str = new Exersise2();
		str.update("Hello how are you");
	}
}
