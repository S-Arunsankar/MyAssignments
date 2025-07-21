package week3_july21AS;

public class LoginTestData {
	
	public void enterUsername() {
		System.out.println("Enter the Username");
	}
	
	public void enterPassword() {
		System.out.println("Enter the Password");
	}
	
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterPassword();
		ltd.enterUsername();
	}
}
