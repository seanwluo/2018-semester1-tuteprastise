package tutesheetpractise;

public class desk {
	private Radio radio;
	private Computer computer;
	private Drawer drawer;
	private Photography photography;
	
	public desk( Radio r,Computer c,Drawer d,Photography p) {  
		radio=r;
		computer=c;
		drawer=d;
		photography=p;
		}
	
	public void  tidyup(){
        radio.close();
		computer.close();
		drawer.close();
		photography.displaypic();
		System.out.println("---- so the desk be tidied up now");	
	}
		
	public void untidy() {
		radio.open();
		computer.open();
		drawer.open();
		photography.displaypic();
	
	}
		
		
}
