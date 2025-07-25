package week3_july22AS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] Value = {1,2,3,4,10,6,8};
		
	
		
		List<Integer> Element = new ArrayList<Integer>();
		
		for(int num :Value) {
			Element.add(num);
		}
//		System.out.println(Element);
		
		Collections.sort(Element);
		System.out.println(Element);
//		System.out.println(Element.get(2));
		
		System.out.println("Missing Numbers");
		for(int i=Element.get(0); i<=Element.get(Element.size()-1) ;i++) { //1  
			if(!Element.contains(i)) {
				System.out.println(i);
				
			}
		}
		
			
			
			
		}
	
	}
		
	
