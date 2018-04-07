package tutesheetpractise;

public class Computer {
	private String brand;
	
	public Computer(String brand) {
		this. brand=brand;
			
	}
	public String setcomputerbrand(String brand) {
		return brand;
	}
	public void open() {
		System.out.println("the"+brand+" computer is opening");
	}
	public void close() {
		System.out.println("the computer is closing");
	}
}
