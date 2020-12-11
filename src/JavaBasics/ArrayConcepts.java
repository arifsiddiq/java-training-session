package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
//Array means - to store similar data type values in array variable. There are two types of arrays(ONE DIMENSIONAL and OBJECT array)
//1. int array- set Array variable, Ex: normal variable: int i but array variable int 1[]
// we can have different arrays like: int, boolens, char etc
	
//set array
// lowest bound/index = 0, upper bound/index = n-1(n is size of array)
// ONE DIMENSIONAL ARRAY
//Advantages of Array - it can store multiple values in single variables with similar data types
		
//DISADVANTAGES of one dimensional array
//1.size is fixed --static array, once assign the array value we cannot increase it later --
//to overcome the above problem, we use COLLECTIONS-arraylist,hastable etc - these are also called DYNAMIC ARRAY concepts
//Collections is a big topic 
		
//2.it stores only similar data types --to overcome this problem,we use OBJECT ARRAY.		
 int i[] = new int[4]; //this is array variable along with space of 4 indexes- `0,1,2,3)
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
	System.out.println(i[0]);
	System.out.println(i[1]);
	System.out.println("**************************************");
	///System.out.println(i[4]); //interview question:- as there is no 4 index, system would give out of bound/index exception error
	System.out.println("**************************************");
	System.out.println(i.length);//will give length or size of array
	
	System.out.println("**************************************");
	//print all values of Array - we need to use loops:ex: For
	for(int j =0;j<i.length;j++){
		System.out.println(i[j]);
		}
	
	System.out.println("**************************************");
	// 2. Double int array
	
	double d[] = new double[3];
	d[0]= 12.11;
	d[1]= 22.01;
	d[2]= 90.23;
	
	System.out.println(d[2]);

System.out.println("**************************************");

  // 3.char array
char c[] = new char[3];
 c[0] = 'a';
 c[1] = 2;
 c[2] = '$';

 // 4. boolen array
 boolean b[]= new boolean[2];
 b[0]= true;
 b[1]= false;
 
 //5.string array
 String s[]= new String[3];
 s[0]= "test";
 s[1]= "hello";
 s[2]= "world";
 System.out.println(s.length);
 System.out.println(s[1]);
 
System.out.println("**************************************");
 //OBJECT ARRAY - Object is the super class of all the indexes/space
Object ob[] = new Object[6]; //O capital as object is a class(same as String)
ob[0] = "tom";
ob[1] = 25;
ob[2] = 11.03;
ob[3]= "18/07/1976";
ob[4] = "M";
ob[5] = "London";
System.out.println(ob[5]);
System.out.println(ob.length);
System.out.println("**************************************");
for(int j =0;j<ob.length;j++){ // to print all the values of object array - use FOR loop
	System.out.println(ob[j]);
}
	}

}
