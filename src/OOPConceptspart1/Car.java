package OOPConceptspart1;

public class Car {
  //car class
	 int mod;// these are class variables and copies of these two variables would be given to object a,b,c
	 int wheel;
	public static void main(String[] args) {
	
   //new Car(); --- this is the object of Car class
   //new -- is a keyword used to create an object
   //a,b,c ---- Object reference variables
   Car a= new Car(); 
   Car b= new Car();
   Car c= new Car();
   
   a.mod = 2015; //initializing class variables
   a.wheel = 4;
   
   b.mod = 2014;
   b.wheel = 4;
   
   c.mod = 2013;
   c.wheel = 4;
   
   System.out.println(a.mod);
   System.out.println(a.wheel);
   
   System.out.println("***********************************");
   
   System.out.println(b.mod);
   System.out.println(b.wheel);
   
System.out.println("***********************************");
   
   System.out.println(c.mod);
   System.out.println(c.wheel);
   System.out.println("***********************************");
  //shifting the reference of objects 
   System.out.println("After shifting the references");
   a=b; //a is pointing to b, b is pointing/refereing to c and c is pointing/refereing to a
   b=c;
   c=a;
   a.mod = 10;
   System.out.println(a.mod); // as we have assinged 10 to 'a' - so it will print 10
   c.mod = 20; 
   System.out.println(a.mod);// as c is pointing to 'a' but a is pointing to b and b=c, so 'a' values be printed as 20
   System.out.println(c.mod);
	
	}

}
