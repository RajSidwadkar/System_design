package builder;

class Desktop {
	  private String motherboard;
	  private String processor;
	  private String memory;
	  private String storage;
	  private String graphicsCard;
	 
	 public void display() {
		 System.out.println( "Desktop Specs : ");
		 System.out.println("Motherboard: " + motherboard );
		 System.out.println("Processor: " +  processor);
		 System.out.println("Memory: " +  memory);
		 System.out.println("Storage: " +  storage);
		 System.out.println("Graphics Card: " + graphicsCard);
		 
	 }
	 
	 public String getMotherboard() {
		 return motherboard;
	 }
	 
	 public void setMotherboard(String motherboard) {
		 this.motherboard = motherboard;
	 }
	 
	 public String getProcessor() {
		 return processor;
	 }
	 
	 public void setProcessor(String processor) {
		 this.processor = processor;
	 }
	 
	 public String getMmory() {
		 return motherboard;
	 }
	 
	 public void setMemory(String memory) {
		 this.memory = memory;
	 }
	 
	 public String getStorage() {
		 return motherboard;
	 }
	 
	 public void setStorage(String storage) {
		 this.storage = storage;
	 }
	 
	 public String getGraphicsCard() {
		 return motherboard;
	 }
	 
	 public void setGraphicsCard(String graphicsCard) {
		 this.graphicsCard = graphicsCard;
	 }
}
