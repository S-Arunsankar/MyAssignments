package week3_july22AS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> listofCompanies = new ArrayList<String>();
		
		for(int i=0; i<companies.length-1;i++) {
			listofCompanies.add(companies[i]);			
		}
		
//		for(String value:companies) {
//			listofCompanies.add(value);
//		}
		
		System.out.println(listofCompanies);
		
		Collections.sort(listofCompanies);
		System.out.println(listofCompanies);
		
		Collections.reverse(listofCompanies);
		System.out.println(listofCompanies);
				
		}

}
