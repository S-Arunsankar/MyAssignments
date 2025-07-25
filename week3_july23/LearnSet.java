package week3_july23;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String web="google";
		char[] webname = web.toCharArray();
		
		System.out.println(webname);
		
	Set<Character> website = new LinkedHashSet<Character>();
	for(int i=0; i<=webname.length-1; i++) {
		website.add(webname[i]);
		
	}
	System.out.println(website);
		
	}

	}


