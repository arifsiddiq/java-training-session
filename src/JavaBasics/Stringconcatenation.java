package JavaBasics;

public class Stringconcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if we give a in the system.out pringln without "" it will print value of a, else will print whatever is 
				///there in the " "
		// println - is used to print on the console with a new line
		//print - is just used to print on the console
		int a = 100; 
		int b = 200;
		
		String x = "hello";
		String y = "world";
		 System.out.println("**************************");
		double c = 10.33;
		double d = 12.21;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y); 
		System.out.println(x+y+a+b);// whenever u add int(ex:a) to strings,then first int will also become string along with
		//other string ex: x+y+a and b would be treated as another string and printed saperately
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		 System.out.println("**************************");	
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		 System.out.println("**************************");
		System.out.println("value of a is:" + a); //+ is the concatination
		System.out.println("The Addition of a and b is:" + (a+b));
		
		//System.out.println ---ln means new line if no ln then no line after one execution, two results would be printed together
		 System.out.println("**************************");
		System.out.print("hello world");
		System.out.println("Automation testing");
		
	}
	

}
