package week2_july14;

public class Browser {
	
	public String lanchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser Lanched Successfully");
		return browserName;
	}
	
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded Successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserclass = new Browser();
		String brow= browserclass.lanchBrowser("Chrome");
		System.out.println(brow);
		browserclass.loadUrl();
		
	}

}

