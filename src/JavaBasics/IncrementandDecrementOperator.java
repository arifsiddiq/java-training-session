package JavaBasics;

public class IncrementandDecrementOperator {

	public static void main(String[] args) {
// post incremental- here it means we are giving initial value of i to j and increasing value of i +1, 
// so i value would be 2 and j value would be 1
		int i =1;
		int j = i++; 
 System.out.println(i);
 System.out.println(j);
 System.out.println("**************************");
 
//pre incremental- here we are increasing the value of 'a'+1 first and then assiging the same value to b
 int a=1;
 int b=++a; // pre incremental
 
 System.out.println(a);
 System.out.println(b);
 
 System.out.println("**************************");
 
//post decremental - first get the value of n and then decrease it by 1, so n would be printed as 1
 // and m is printed as 2
 int n =2; 
 int m = n--;
 System.out.println(n);
 System.out.println(m);
 
 System.out.println("**************************");
 
//pre decremental - first get decrease the value of p by 1 so p is printed as 1 and give this value to q
 //now q value is equal to the new value of P, i.e 1, so q is also printed as 1
 int p =2; 
 int q = --p;
 System.out.println(p);
 System.out.println(q);
 
	}

}
