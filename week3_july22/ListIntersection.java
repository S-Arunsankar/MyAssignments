package week3_july22;


import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create integer array
		int[] set1 = {3,2,11,4,6,7};
		int[] set2 = {1,2,8,4,9,7};
		
		//create empty array list
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		//add array to list
		for(int num:set1) {
			list1.add(num);
		}
		for(int num1:set2) {
			list2.add(num1);
		}
		//compare the list to find the same value
		for(int i=0; i<=list1.size()-1; i++) {
			if(list1.contains(list2.get(i))) {
				System.out.println(list2.get(i));
				
			}
		}
		
	
		
		
		
		
	}

}
