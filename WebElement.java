package week3_july21AS;

public class WebElement {
	
	public void click() {
		System.out.println("Clicked successfully");
	}
	
	public void setText(String text) {
		System.out.println(text);
		
	}
	public static void main(String[] args) {
		WebElement Web = new WebElement();
		Web.click();
		Web.setText("WebStructure");
	}

}
