package JavaBasics;

public class IfElseComparison {

	public static void main(String[] args) {
		
	int a = 30;
	int b = 20;
	
	//if - is a key word and will start with small letter and after if it will treat as boolen - true or false

	if(b>a) 
	{
		System.out.println("b is greater than a");
	}
	else {
		System.out.println("a is greater than b");
	}
	 System.out.println("**************************");
	// comparision operators  - <, >, ==, 
		
	int c = 40;
	int d = 50;
	
	if(c==d) {	  
	System.out.println("c and d are equal");
	}
	else 
	{ System.out.println("c and d are not equal");
	
	}
	 System.out.println("**************************");
	//write a logic to find out the highest number
	int a1 = 400;
	int b1 = 500;
	int c1 = 300;
	
	//nested if - else
	
	if(a1>b1 & a1>c1) { //false & true = false
		System.out.println("a1 is the greatest");}
	else if(b1>c1)
	{
		System.out.println("b1 is the greatest");
	}
	else{
		System.out.println("c1 is the greatest");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	}


