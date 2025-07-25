package week3_july22;

public class Palindrome {
	
//	public static boolean isPalindrom() {  
	   	 public static boolean checkPalindrome(String str) {
			// Write your code here		         
		        
		        String clearedName = str.toLowerCase();
		        
		        boolean isPalindrom = true;
		        
		        for(int i=0; i<=clearedName.length()-1; i++) {
		        	if(clearedName.charAt(i)!=clearedName.charAt(clearedName.length()-1-i)) {
		        		isPalindrom = false;
		        		break;
		        		
		        	}
		        }
		        if(isPalindrom){
		        	System.out.println(str +" is a palindrom");
		        }else{
		        	System.out.println(str +" is not a palindrom");
		        }
		        return true;
	   	 }
	   	 public static void main(String[] args) {
	   		Palindrome.checkPalindrome("MADAM");
		}
		
		}
