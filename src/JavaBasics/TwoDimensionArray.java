package JavaBasics;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
	String x [][] = new String[3][5];	//two dimension if two boxes or []i or [][]x -  here x is the string name, 3 is the rows and 5 is the coloumns 
		System.out.println(x.length); // answer 3 is the :total no. of rows
		System.out.println(x[0].length);//answer 5 is the :total no. of coloumns
		
		//1st row
		x[0][0]= "a"; //first [] is the first,i.e 0 index row and second [] is for coloumn value
		x[0][1]= "b";
		x[0][2]= "c";
		x[0][3]= "d";
		x[0][4]= "e";
		
		// 2nd row
		x[0][0]= "a1"; //first [] is the 1 index row and second [] is for coloumn value
		x[1][1]= "b1";
		x[1][2]= "c1";
		x[1][3]= "d1";
		x[1][4]= "e1";
		
		//3rd row
		x[0][0]= "a2"; //first [] is the 2 index row and second [] is for coloumn value
		x[2][1]= "b2";
		x[2][2]= "c2";
		x[2][3]= "d2";
		x[2][4]= "e2";
		
		System.out.println(x[1][2]); // to find out value for 1st row and 2nd coloumn 
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		System.out.println("*******************************");
		//print all the values of 2d array - need to use two FOR loops - this would help in selinum when we want to fetch the data from excel file
		// logic of result: 
		// row = 0, col = 0 to 4
		// row = 1, col = 0 to 4
		// row = 2, col = 0 to 4
		for(int row =0;row<x.length;row++){
			for(int col=0;col<x[0].length;col++){
			System.out.println(x[row][col]);
		
			}
		}
		
	}

}
