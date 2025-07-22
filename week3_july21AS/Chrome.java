package week3_july21;

public class Chrome extends Browser {

	
	public void openIncognito() {
		System.out.print("Opened Incognito Successfully");
	}
	
	public void clearCache() {
		System.out.print("Cleared cache successfully");
	}
	
	public static void main(String[] args) {
		Chrome chromeoption = new Chrome();
		chromeoption.openIncognito();
		chromeoption.clearCache();
		chromeoption.openUrl();
		chromeoption.closeBrowser();
		chromeoption.navigateBack();
		
		
		System.out.print(chromeoption.browserName);
		System.out.print(chromeoption.browserVersion);
	}
}
