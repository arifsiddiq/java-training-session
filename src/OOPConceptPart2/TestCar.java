package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
	
		//the below is called static polymorphism or compile time polymorphism as java would decide whether to pick the data available in parent or child classes
		BMW b = new BMW(); // creating a object for BMW
		b.start(); // accessing a particular values from BMW class, i.e Start
		b.stop();
		b.refuel();
        b.theftsafety();
        
        System.out.println("*********************");
        Car c = new Car();
        c.start();
        c.stop();
		c.refuel();
      //  c.theftsafety cannot be accessed as this Car class(parent) cannot access/inherent any information but child can have all info from parent
		
        System.out.println("*********************");
	
		//Top Casting
	Car c1 =  new BMW(); // child class objects can be referred by parent class reference variable ---
	//is called Dynamic polymorphism or run time polymorphism
	c1.stop();
	c1.start();
	c1.refuel();
	
	//down Casting
	BMW b1 = (BMW)new Car(); // this will give exception error

}
}
