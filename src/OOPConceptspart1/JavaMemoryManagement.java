package OOPConceptspart1;

//JAVA MEMORY Management
//1.	Stack memory – non static variables are stored
//2.	Heap memory – objects of class are stored and variables are called from stack memory
//3.   metaspace – static variables are stored
// Garbage collector - it will destroy the previous reference 

public class JavaMemoryManagement {
	int a, b;

	public static void main(String[] args) {
		

	}

	void m1() {
		int i = 10; //local variables are stored in STACK memory - in the form of LIFO - last in first out
	}
	
	void m2() {
		int y = 20;
	}
	
	void m3() {
		int z = 30;
	}
}

