package week2_july15;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		
		char[] test1 = test.toCharArray();
		
		
		for(int i=0; i<=test1.length-1; i++)
			if(i%2==1) {
				test1[i]=Character.toUpperCase(test1[i]);
			}
			System.out.print(test1);	

	}

}
