package week3_july21AS;


public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Click button checked successfully");
	}

	public static void main(String[] args) {
		CheckBoxButton Check = new CheckBoxButton();
		Check.clickCheckButton();
		Check.submit();
		Check.click();
		Check.setText("Printed");
		
		
	}
}
