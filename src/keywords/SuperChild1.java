package keywords;

public class SuperChild1 extends Super1{
   
	int i = 20;
	public SuperChild1()
	{
		System.out.println("calling SuperChild1 class construcor...");
		
	}
	public SuperChild1(int i)
	{
		super(i);// calling super class construcor
		System.out.println("calling parameter SuperChild1 class construcor..." +i);
		
	}
	
	public static void main(String[] args) {
		SuperChild1 ch = new SuperChild1();
		SuperChild1 ch1 = new SuperChild1(8);

	}

}
