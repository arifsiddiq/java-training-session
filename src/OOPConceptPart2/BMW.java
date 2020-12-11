package OOPConceptPart2;

//as not executing..did not select main method // also called" as a relationship"q
// method overriding: when same method is present in parent class as well as in child class with the same name and same number of arguments
public class BMW extends Car{ // Extends is the keyword for forming relationship between different classes

public void start() { //this is overridden method
	System.out.println("BMW.....Start");
}
public void theftsafety() {
	System.out.println("BMW.....TheftSafety");

}

}