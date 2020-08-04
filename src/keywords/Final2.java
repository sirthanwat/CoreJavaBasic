package keywords;

//it should be initialize
//cant inherit any final class

public class Final2 extends Final1{ //if base class is final then cant be inheritate.

	public void test() { //	- Cannot override the final method from Final1 class
		int i = 2000; //this is local var not global
		System.out.println(i);
	}
	public static void main(String[] args) {
		Final2 f = new Final2();
		f.test();
	}
}
