package OOPConceptspart1;

public class LocalVsGlobalVariables {

	// Global variables - Class variables - the scope of the below variables would be available through out the program
	//to access globle variables anywhere in the prog, we need to create object of this particular class by this copy of this is created
	//non static stuff/methods would be given to the above object // this is also non static
	
			String name = "Tom"; // string variable  
			int age = 22; // int variable 
			
	public static void main(String[] args) { // main method is static and saperete space is crated
	
		int i = 10; // local variable of main method
		 System.out.println(i);
		 
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables(); 
	// created object of global variables under main method to access the global variables
        System.out.println(obj.name);
        System.out.println(obj.age);
	}

	 public void sum() {  // this is non static
		 int i = 15; //local variable for sum method
		 int j = 20;
		
}

}