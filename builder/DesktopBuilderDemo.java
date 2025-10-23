package builder;

public class DesktopBuilderDemo {

	public static void main(String[] args) {
		DesktopDirector director = new DesktopDirector();
		
		DellDesktopBuilder dell = new DellDesktopBuilder();
		Desktop dellDesktop = director.buildDesktop(dell);

		
		HPDesktopBuilder hp = new HPDesktopBuilder();
		Desktop HPDesktop = director.buildDesktop(hp);
		
		
		dellDesktop.display();
		HPDesktop.display();
	}

}
