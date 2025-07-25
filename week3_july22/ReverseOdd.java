package week3_july22;

public class ReverseOdd {
	
	public static String reverseEvenWords(String str) {
		
		String[] value = str.split(" ");
		
		for(int i =0; i<=value.length-1; i++) {
			if(i%2==0) {
				char[] val = value[i].toCharArray();
				
			for(int j=val.length-1; j>=0; j--) {
				System.out.print(val[j]);
			}
			}else {
				System.out.print(value[i]);
			}
			System.out.print(" ");
		}
		
		return str;		
	}
	
	public static void main(String[] args) {
		ReverseOdd.reverseEvenWords("I am Software tester");
	}

}
