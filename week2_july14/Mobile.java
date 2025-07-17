package week2_july14;

public class Mobile {

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make call");
		
	}
	
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("take photo");
		
	}
	
	public void callDetails(int number, String name,boolean Status ) {
		// TODO Auto-generated method stub
		System.out.println(number+name+Status);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile Check1= new Mobile();
		Check1.makeCall();
		Check1.takePhoto();
		Check1.callDetails(3345, "Boo", false);
		
	}

}
