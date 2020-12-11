package OOPConceptPart2;

public interface USBank {
//we need to create rules and regulations of bank in the form of method
//in interface we don't write full method body but just define the methods
// in interface we can declare the variables and they are by default static in nature
//variables values will not be able to change
//No static methods are available in interface as intefaces are part of objects
// it does not have main method
//we cannot create objects of interface as interface are abstract in nature
// variable values will not be changed, its final/constant in nature 
	
int min_bal = 100; 
public void credit(); // its method

public void debit();

public void transfermoney();

// now create child class with name HSBCBank and use keyword "implement" against child class name








}
