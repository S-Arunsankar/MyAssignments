package week2_july15;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "Testleaf";
		
	char[] name = companyName.toCharArray();
			System.out.println(name);
			
			for (int i=name.length-1; i>=0; i--) {
				System.out.println(name[i]);
			}
	}

}
