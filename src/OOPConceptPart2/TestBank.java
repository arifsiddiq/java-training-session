package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
// we cannot create the object of USbank(parent interface) in testbank but u can crate object of HSBC bank
// as hsbc bank is a class and publicly defined
		
	System.out.println(USBank.min_bal); // to print min bal from interface we need use USBank - interface name
	// and we cannot change the value of min bal here as this is static in nature, already defined in USBank interface

	HSBCBank hs = new HSBCBank();// can access all the methods from hsbc
	hs.credit();
	hs.debit();
	hs.transfermoney();
	hs.Educationloan();
	hs.carloan();  // now run this prog
	
	// dynamic polymorphism : child class object can be referred by
	//parent interface reference variables
	
	USBank b = new HSBCBank();
	b.credit();
	b.debit();
	b.transfermoney();
//b.educationloans(); -- i cannot access this method as this defined by hsbc bank, only overridden or copy of
	// parent interface can be defined
		
	}

}
