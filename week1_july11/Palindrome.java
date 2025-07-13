package week1_july11;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=121;
		
		int input = n;
		int output =0;
		
	for (int i=n; i>0;i/=10) {
		int rem= i%10; 
		output = output * 10 + rem; 
		
		
	}
	if(input == output) {
		System.out.println("it is a Palindrome");
	}else {
		System.out.println("it is not a palindrome");
	}

	}

}
