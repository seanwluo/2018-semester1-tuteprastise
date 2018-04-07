package tutesheetpractise;

public class Drawer {
	private int drawersnumber;
	private class Paper{
		private String papercontent;
		private Paper(String papercontent) {
			this.papercontent=papercontent;
		}
	}
	private Paper paper ;
	public Drawer(int drawersnumber) {
		this.drawersnumber=drawersnumber;
		paper=new Paper("javanot");
		
	}
	
	
	public void open() {
		System.out.println("the drawer"+drawersnumber+"drawers"+" is openiing");
		System.out.println("many"+"\t"+paper.papercontent+"\t"+"in it");
	}
	public void close() {
		System.out.println("the drawer is clsoing now");
	}
}
