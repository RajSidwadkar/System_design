package simpleFactory;

public class clientCode {

	public static void main(String[] args) {
		
	
		Car c1 = carFactory.createCar("SUV");
		c1.drive();
		
		
		Car c2 = carFactory.createCar("Thar");
		c2.drive();
	
		}

}
