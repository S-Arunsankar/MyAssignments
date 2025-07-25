package week3_july22;

public class Solution{
	public static int charCount(String str) {
		
		int num =0;
		char[] chart = str.toCharArray();
		char target = 'e';
		
		for(int i=0; i<=chart.length-1; i++) {
			if(chart[i] ==target) {
				num++;					
			}
		}	
		return num;		
	}
	public static void main(String[] args) {
		int value = Solution.charCount("Welcome to Chennai");
		System.out.println(value);
	}

}
