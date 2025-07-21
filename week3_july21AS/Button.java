package week3_july21AS;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submitted Successfully");
		
	}
	
	public static void main(String[] args) {
		
		Button sub = new Button();
		sub.submit();
		sub.click();
		sub.setText("Texted");
		
	}
	
	

}
