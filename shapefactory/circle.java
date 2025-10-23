package simpleFactory.shapefactory;

public class circle extends shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

}

class square extends shape{

	@Override
	public void draw() {
		System.out.println("Drawing Square");
		
	}
}