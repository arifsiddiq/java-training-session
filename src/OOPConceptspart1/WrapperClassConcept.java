package OOPConceptspart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
	// Wrapper is class which converts one data type to other 

		 String x = "100";
		 System.out.println(x+20);
		 
		 // data conversation from string to integer
		 int i = Integer.parseInt(x); // Integer is a wrapper class, hence starting with Capital and parseInt is a method
		 System.out.println(i+20);
		 
		 //Integer, Double, Character, Boolean -- types of Wrapper class
		 
		 // String to Double Conversion
		 String y = "12.13";
		 double d = Double.parseDouble(y);
		 System.out.println(d+20);
		 
		 // String to boolean
		 String k = "True";
		 boolean b = Boolean.parseBoolean(k);
		 System.out.println(b);
		 
		 //integer to String conversion
		 
		 int j = 200;
		 System.out.println(j+20);
		 String s = String.valueOf(j);
		 System.out.println(s+20);
		 
		 String u = "100A";
		 Integer.parseInt(u);// it will give number format exception
		 
	}

}
