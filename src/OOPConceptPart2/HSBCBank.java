package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { // as we HSBC is implementing two interfaces --
// implementing is like opening branches and using the existing methods of parent bank
// we need to define all the methods used in USBank else it will give error, hsbc can have its own methods aswell
// if a class is implementing any interface, then its mandatory to define/overrides(copy) all the methods of interface
	// here we are acheiving multiple inheretance - means multiple parents are there	
	// this concept is also called "Is-a relationship" 
	// As-a relationship means - class to class relationship
	
	//all the methods of interface
	int min_bal = 100;
	
	//overriding(copying from) USBank
	public void credit() {
		
	System.out.println("hsbc credit");
	}
	
	
	// its method

	public void debit() {
		
		System.out.println("hsbc debit");
		
	}

	public void transfermoney() {
		System.out.println("hsbc transfermoney");
	
	
	}
	
	//saperate methods of HSBCBank class
	
	public void Educationloan() {
		
		System.out.println("hsbc Education loan");
				
	}
	
	public void carloan() {
		System.out.println("hsbc carloan");
		// to check all the above feature, create new class by name "TestBank" also select main method
	
	}
	
	//brazil bank method: overriding/copynig from Brazilbank
	public void mutualfund() {
		
	System.out.println("hsbc mutualfund");	
		
	}
}


