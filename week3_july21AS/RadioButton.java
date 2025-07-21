package week3_july21AS;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("Radiobutton selected successfully");
	}
	
	public static void main(String[] args) {
		RadioButton sel = new RadioButton();
		sel.selectRadioButton();
		sel.submit();
		sel.click();
		sel.submit();
		sel.setText("personal");
	}
}
