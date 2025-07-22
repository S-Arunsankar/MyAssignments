package week3_july21;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.print("Taken snap");
	}
	
	public void clearCookies() {
		System.out.print("cookies cleared");
	}
	
	public static void main(String[] args) {
		Edge Edgeoptions = new Edge();
		Edgeoptions.takeSnap();
		Edgeoptions.clearCookies();
		Edgeoptions.openUrl();
		Edgeoptions.navigateBack();
		Edgeoptions.closeBrowser();
		
		System.out.print(Edgeoptions.browserName);
		System.out.print(Edgeoptions.browserVersion);
	}

}
