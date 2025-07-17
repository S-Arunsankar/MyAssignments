package week2_july15;



public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		
		String[] testSplit = test.split(" ");
				
		for(int i=0; i<testSplit.length; i++) {
			//System.out.print(testSplit[i]);
			if(i%2!=0) {
				
				char[] splitTest = testSplit[i].toCharArray();
				
				for (int j=splitTest.length-1; j>=0; j--) {
					
					System.out.print(splitTest[j]);
				}
			}
			else {
				System.out.print(testSplit[i]);
			}
			System.out.print(" ");
		}
		

	}}


