package keywords;

//it should be initialize
//cant inherit any final class
//public final class Final { //public final class Final : if base class is final then cant be inheritate.
public class Final {
	final int i = 100;

	public void test() {
		// i = 2000; //cant modified
		int i = 2000; //this is local var not global
		System.out.println(i);
	}

	public void test1()
	{ 
		int i =20;
		//this.i = i;// cant modified it
		System.out.println(this.i);

	}
	public static void main(String[] args) {
		Final f = new Final();
		f.test();
		f.test1();

	}

}
