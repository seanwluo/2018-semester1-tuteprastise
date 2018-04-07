package tutesheetpractise;

public class Radio {
	private String brand;
	private String channel;
	
	public Radio(String brand,String channel) {
		this.brand=brand;
		this.channel=channel;
	}
	public String setbrand(String brand) {
		return brand;
	}
	public String setchannel(String channel) {
		return channel;
	}
	
		public void open(){
			System.out.println(brand+"radio is on the channel:"+channel);
		}
		public void close(){
			System.out.println("radio is closing now");
		}
}
