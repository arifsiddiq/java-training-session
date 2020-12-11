package OOPConceptspart1;

public class StaticAndNonStaticConcept {
//declaring global variable, as declaring in Class

	//global variables: the scope of global variables will be available across all the functions with some conditions-
	//for access static variables we can call/access directly and if its non static variable:you have to create the object
	String name ="Tom"; // non static global variable
	static int age= 25; // static global variable
	
	public static void main(String[] args) {
	// how to call static methods and variables?
	//1. Direct calling:
	sum();
	
	//2.Calling by classname:
	StaticAndNonStaticConcept.sum();
	
	System.out.println(age);
	System.out.println(StaticAndNonStaticConcept.age);
	
	//how to call Non static methods and variables:using objects
	StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
	obj.sendmail();
	System.out.println(obj.name);
	
	//can i access static methods by using object reference ? yes
	obj.sum(); //waring will be given --should be accessed in static way
	

	
	}

	public void sendmail(){  // Non static method
	System.out.println("Send Mail method");
	
	}
  public static void sum() {  // static method
  System.out.println("Sum method");
		
  }

}

