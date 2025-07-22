package week3_july21;

public class MethodOverridden extends MethodOverload {
	
	public void takesnap() {
		System.out.println("snap taken");
	}
	
	public void reportclass(String msg, String status) {
		super.reportclass(msg, status);
		System.out.println("Reportmethod not available");
		
	}
	
	public static void main(String[] args) {
		MethodOverridden method = new MethodOverridden();
		method.takesnap();
		method.reportclass("message", "done");
		method.reportclass("pass", "passed", true);
	}
	
	

}
