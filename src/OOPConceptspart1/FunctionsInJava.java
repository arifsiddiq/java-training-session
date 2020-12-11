package OOPConceptspart1;

public class FunctionsInJava {

	public static void main(String[] args) { // as initially main method does not have any code, all the below methods/functions will not return 
		// -any value, so for this we need to create Objects in main method to call/reference the other below methods/functions
		//functions and methods both are same (ex of function - main method: public static void main(String[] args)
	
		FunctionsInJava obj = new FunctionsInJava();
		//one object is created and obj is the reference variable, referring to the object
	//after creating the object, the copy of all Non static methods(below ex:test() --will be given to this object
	
	obj.test();
	int l = obj.pqr(); //here we are initializing obj.pqr as int and then printing the value..which is coming from return
	System.out.println(l);
	
	String s1 = obj.qa();
	System.out.println(s1);
	
	int div = obj.division(30,10); //here we are giving the x, y values in main method but divison is happening in non static method/function 
	System.out.println(div);
	
	// Note: Main method will have void as it will never return the value, it only fetch the values from non main methods
	}
	
	
	
   // Non static methods/functions //void does not return any value
	//return type = void
	public static void test() { //test is the method name ()--means its a method
		                        // NO INPUT - NO VALUE  - 1.Type of function/method
		System.out.println("test method");
		
	}
	
	//return type = int
	public int pqr( ) { //what ever is written before method name is called return type: ex: pqr is the method name and int is the return type
		System.out.println("pqr method"); //NO INPUT BUT RETURN SOME VALUE 2.Type of function/method
		int a = 10;
		int b = 20;
		int c = a+b;
		return c; // as the method is void,return c will not give result and error comes, so to over come this, remove void from method by int.
			}     // return - this will give the value of C to obj pqr in main method
	
	//return type = string
	public String qa() {
		System.out.println("qa method"); //NO INPUT BUT RETURN SOME VALUE 2.Type of function/method
		int a = 10;
		String s = "Selenium";
		return s;
	}
	
	//return type = int
	public int division(int x, int y) {  //x & y are input parameters/arguments
		System.out.println("division method");
		int d = x/y;
		return d;
	}
	
		
	
}
	
	


