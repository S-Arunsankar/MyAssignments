package week2_july15;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String text = "We learn Java basics as part of java sessions in java week1";
			int count = 0;
			
			String[] textSplit = text.split(" ");
			
			for(int i=0; i<textSplit.length; i++) {
				if(!textSplit[i].equals("")) {
				for(int j=i+1; j<textSplit.length; j++) {
					
					if(textSplit[i].equalsIgnoreCase(textSplit[j])) {
						
						textSplit[j]="";
						count++;	
					}
					
				}
				}
				
						
				}
			if(count>0) {
			for(int i=0; i<textSplit.length; i++) {
				if(!textSplit[i].equals("")) {
				System.out.print(textSplit[i]+ " ");
			}
			}
			
			}else {
				System.out.println("No duplicate Words found");
			}
			}
			   
				}				
			
		
	


