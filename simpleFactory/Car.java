package simpleFactory;

 public interface Car {

	void drive();
}

class Thar implements Car{

	@Override
	public void drive() {
			System.out.println("Driving Thar..!");
		
	}
	
}

class SUV implements Car{

	@Override
	public void drive() {
		System.out.println("Driving SUV..!");
		
	}
	
}