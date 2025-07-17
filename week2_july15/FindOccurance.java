package week2_july15;



public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestLeaf";
		int num = 0;
		
		
		char[] inputArray = input.toCharArray();
		char target = 'e';
		
		//System.out.println(inputArray.length);
		
		for(int i=0; i<=inputArray.length-1;i++) {
			
			if(inputArray[i]==target) {
			int value = num++;
			System.out.println(value);
			}
			
		}
				

	}

}
