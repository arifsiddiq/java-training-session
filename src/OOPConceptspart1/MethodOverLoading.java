package OOPConceptspart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading(); //creating object and then calling the below sum method in main method
        obj.Sum();
        obj.Sum(10); // this print i value from one input method
        obj.Sum(10, 5);// this print i value from two input method
	}
	
	//we can create multiple main methods(overloading, however method type should be different/number-
	//of input parameters should be different else will give error
	public static void main(String feroz) {
	
	}
	
	public static void main(int p) {
		
		}
	
	public static void main(int p, int h) {
		
	}
	//we can overload main method also as seen above
	//we cannot create a method inside a method
	//duplicate method--i.e same method name with same number of arguments/input parameters with different data types -- are not allowed
	//method overloading --- when the method name is same with different arguments/input parameters with different data types within the same class --this is allowed
	
	public void Sum() { // zero input parameter
	System.out.println("sum method--zero input parameter");
}                                                        
	

	public void Sum(double d) {
		System.out.println("sum method -- one input parameter");
		
		}
	    public void Sum(int i) {
		System.out.println("sum method -- one input parameter");
		System.out.println(i);
		}
   
	public void Sum(int k, int l) {
		System.out.println("sum method -- two input parameters");
		System.out.println(k+l);
}
}