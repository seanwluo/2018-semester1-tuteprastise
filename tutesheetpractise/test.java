package tutesheetpractise;

public class test {
	public static void main(String[] args) {
		Radio rmitradio=new Radio("Sony","AM1003");
		Computer rmitPC=new Computer("MAC-G4.");
		Drawer rmitdrawer=new Drawer(6);
		Photography rmitpic=new Photography("party");
		
		
		desk rmitdesk=new desk(rmitradio,rmitPC,rmitdrawer,rmitpic);
		//rmitdesk.tidyup();
		rmitdesk.untidy();
		
	}
}
