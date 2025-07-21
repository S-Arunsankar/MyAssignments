package week3_july21AS;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("text received successfully");
	}
	
	public static void main(String[] args) {
		TextField field = new TextField();
		field.click();
		field.getText();
		field.setText("Texted");
		
	}
}
