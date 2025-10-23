package simpleFactory.shapefactory;

public class clientCode {

	public static void main(String[] args) {
		shape sh = shapeFactory.createShape("Circle");
		sh.draw();
		
		shape sh1 = shapeFactory.createShape("Square");
		sh1.draw();
		
		shape sh3 = shapeFactory.createShape("Triangle");
		sh3.draw();
	}

}
