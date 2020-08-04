package Basics.SubPkg;
import Basics.PublicAccessModifierClass;
//import Basics.DefaultAccessModifierClass; //bcoz class is default or pkg
import Basics.Object;
import Basics.Object2;
import stringsBasics.StringBaseic;
public class SubMainMethod {
	
	public static void main(StringBaseic args[]) {
		Object obj = new Object();
		obj.sub();
		obj.add();
		// get result as per calling the method sequence using object
		
		Object2 obj1 = new Object2();
		obj1.mul();	
		
		PublicAccessModifierClass am = new PublicAccessModifierClass();
		am.testPublic();// will access throughout the project
		//obj1.testPrivate(); //will not be visible , access within class only
		//am.testDefault(); // within same pkg only it will be accessible
	   // am.testProtected();//access within same pkg
		
		//DefaultAccessModifierClass dm = new DefaultAccessModifierClass();//	-its default cannot be resolved to a type
        //cant access any member of the class

	}
}