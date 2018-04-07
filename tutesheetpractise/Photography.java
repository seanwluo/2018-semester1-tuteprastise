package tutesheetpractise;

public class Photography {
		private String title;
		String date="1993.02.19";
		
		public Photography(String title) {
			this .title=title;
		};
	//	public String settitle(String name) {
		//	return name;
		//}
		public void displaypic() {
			System.out.println("the pic was taken in"+date+"the title is about "+title);
		}
}
