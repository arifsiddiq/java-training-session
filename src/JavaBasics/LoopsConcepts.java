package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
// loops - While and For loops - to repeat the action we use these loops
//1. while loop - while is a key word hence starts with small letter 
//Disadvantage: if we do not give incremental path, while will generate infinite loop, keep on going without break
		int i = 1; //initialization
		      while(i<=10) {    //conditional path
    	  System.out.println(i);  // incremental/decremental path
    	  i = i+1;
      }
      
		 System.out.println("************************");
     // 2. For loop - in this initialize, conditional path and incremental/decremental path would in one single line
     // j++ = J+1 --- mostly FOR loop is used in selinium
		
   for(int j=1;j<=10; j++) {
	System.out.println(j);   
   
   }
    System.out.println("************************");
      
   //print 10 to 1
   for(int j=10;j>=1;j--) {
   
	 System.out.println(j);
   }
   System.out.println("************************");
   // -1 is greater than 10 - true
   // 1 is greater than 10 - false
   for(int j=-1;j>=-10; j--) {
	   
		 System.out.println(j);
	   }
   
   
	}

}
