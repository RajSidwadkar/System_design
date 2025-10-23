package simpleFactory;

public class carFactory {
	public static Car createCar(String type) {
	
		
		if (type.equalsIgnoreCase("Thar")) {
			return new Thar();
		}
		else if (type.equalsIgnoreCase("SUV")) {
			return new SUV();
		}
		else if(!type.equalsIgnoreCase("Thar") && !type.equalsIgnoreCase("SUV")) {
			throw new IllegalArgumentException("Unknown Car Type :"+ type);
		} 
		
		return null;
		}
	}


