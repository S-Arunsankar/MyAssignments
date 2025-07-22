package week3_july21;

public class MethodOverload {

	
	public void reportclass(String msg, String status) {
		System.out.println(msg+status);		
	}
	
	public void reportclass(String msg, String status, boolean snap) {
		System.out.println(msg+status+snap);
		
	}
	
	public static void main(String[] args) {
		MethodOverload overload = new MethodOverload();
		overload.reportclass("do", "done");
		overload.reportclass("do", "done", true);
	}
}
