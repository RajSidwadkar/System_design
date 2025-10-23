package builder;

public class HPDesktopBuilder extends DesktopBuilder {

	public void buildMotherboard() {
		desktop.setMotherboard("HP Motherboard");
		
	}

	@Override
	public void buildProcessor() {
		desktop.setProcessor("HP Processor");
		
	}

	@Override
	public void buildMemory() {
		desktop.setMemory("16GB DDR4 RAM");
		
	}

	@Override
	public void buildStorage() {
		desktop.setStorage("512GB SSD");
		
	}

	@Override
	public void buildGraphicsCard() {
		desktop.setGraphicsCard("Integrated Graphics");
	}

}



