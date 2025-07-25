package week3_july22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create integer into array
		int[] number = {3,2,11,4,6,7};
		
		//create empty list
		List<Integer> largest = new ArrayList<>();
		
		//add the integer into list
		for(int num:number) {
			largest.add(num);
		}
		
		//Sort the order
		Collections.sort(largest);
		System.out.println(largest);
		
		//make sure array have more than 2 value
		if(largest.size()>=2) {
//		
		System.out.println(largest.get(largest.size()-2));
		}

	}

}
