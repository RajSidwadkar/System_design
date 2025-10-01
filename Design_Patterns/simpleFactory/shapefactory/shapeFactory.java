package simpleFactory.shapefactory;

public class shapeFactory {
	public static shape createShape(String s) {
		if ("Circle".equals(s)) {
			return new circle();
		}
		else if("Square".equals(s)){
			return new square();
		}
		else {
			throw new IllegalArgumentException("Unknown Shape :" + s);
		}
	}
	
}
