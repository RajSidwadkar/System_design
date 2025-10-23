package builder;

public class DellDesktopBuilder extends DesktopBuilder {

	@Override
	public void buildMotherboard() {
		desktop.setMotherboard("Dell Motherboard");
		
	}

	@Override
	public void buildProcessor() {
		desktop.setProcessor("Dell Processor");
		
	}

	@Override
	public void buildMemory() {
		desktop.setMemory("32GB DDR4 RAM");
		
	}

	@Override
	public void buildStorage() {
		desktop.setStorage("1 TB SSD");
		
	}

	@Override
	public void buildGraphicsCard() {
		desktop.setGraphicsCard("NVIDIA RTX 3080");
	}

}
