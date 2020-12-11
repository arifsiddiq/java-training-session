package JavaBasics;

public class ConstructorConcept {

	
//constructor --it is class entity which is used to define some class features while creating the objects in the form on global variables
// constructor name should be same as class name // it cannot return any value so we do not use 'static/void'
//it looks like a function but it is not a function. there are different types of constructors
//to call a constructor - it will be called automatically immed after u create a object in the main method
//but for functions: to call the constructor.. we need to create reference
 public ConstructorConcept() // default constructor as i am not passing anything. it is hidden constructor
 {
	 System.out.println("default constructor");
 }
	
 public ConstructorConcept(int i) {  //single parameter constructor
	 System.out.println("single param constructor");
	 System.out.println("the value of i"+ i); // this is overloading the constructor
	
 }
 
 public ConstructorConcept(int i, int j) {  //double parameter constructor
	 System.out.println("two param constructor");
	 System.out.println("the value of i"+ i); // this is overloading the constructor
	 System.out.println("the value of j"+ j);
 }
	public static void main(String[] args) {
		
ConstructorConcept obj = new ConstructorConcept();
ConstructorConcept obj1 = new ConstructorConcept(10);
ConstructorConcept obj2 = new ConstructorConcept(10, 20);
	}

}
