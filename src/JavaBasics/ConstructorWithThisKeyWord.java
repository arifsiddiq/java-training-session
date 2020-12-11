package JavaBasics;

public class ConstructorWithThisKeyWord {

	//class variables
	String name;
	int age;
	
	public ConstructorWithThisKeyWord(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {

	ConstructorWithThisKeyWord obj = new ConstructorWithThisKeyWord("Tom", 30);
	
	

	}
}
