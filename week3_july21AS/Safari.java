package week3_july21;

public class Safari extends Browser {

	public void readerMode() {
		System.out.print("ReaderMode Turned on");
	}
	
	public void fullScreenMode() {
		System.out.print("Fullscreen mode is on");
	}
	
	public static void main(String[] args) {
		Safari safariopt = new Safari();
		safariopt.readerMode();
		safariopt.fullScreenMode();
		safariopt.openUrl();
		safariopt.closeBrowser();
		safariopt.navigateBack();
	
		
		System.out.print(safariopt.browserName);
		System.out.print(safariopt.browserVersion);
		
		
		
	}
}

