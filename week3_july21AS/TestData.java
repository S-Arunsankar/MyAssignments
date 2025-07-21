package week3_july21AS;

public class TestData extends LoginTestData {
	public void enterCredentials() {
		System.out.println("enter the credentials");
	}
	
	public void navigateToHomepage() {
		System.out.println("navigation to homepage");
	}
	
	public static void main(String[] args) {
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomepage();
		td.enterUsername();
		td.enterPassword();
		
	}
}

