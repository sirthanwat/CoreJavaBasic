package Basics.ConditionHandling;


public class TableForEachLoop {

//will iterate each element from array without using indexing 	
	//directly using variable name we can access the elemenent of array 
	//it will execute all elements if we want to iterate only few element then preper for loop
	public void verifyInc() {
		int arr[] = {3, 8, 9, 10, 11};
		for (int i : arr)
			System.out.println("Iterating each loop :" +i); //not using index 
	}

	public static void main(String[] args) {
		TableForEachLoop con = new TableForEachLoop();			
		con.verifyInc();
	}
}
