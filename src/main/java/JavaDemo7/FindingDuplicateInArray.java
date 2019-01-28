package JavaDemo7;

import java.util.ArrayList;
import java.util.List;

public class FindingDuplicateInArray {

	public static void main(String[] args) {

		int arr1[]={3,4,2,3,4,5,6,7,3,2,9,4,90,90,8,67,78,90,90,90,2};
		String arr2[]={"abc","abc","xyz","dfg","oki","lpo","xyz"};
		//finding using list
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> dup1=new ArrayList<Integer>();
		
		List<String> list2=new ArrayList<String>();
		List<String> dup2=new ArrayList<String>();
	
		for(int i:arr1){
			if(!list1.contains(i))
				list1.add(i);
			else if(!dup1.contains(i))
				dup1.add(i);			
			}
		
		System.out.println(dup1);
		
		for(String s:arr2){
		if(!list2.contains(s))
			list2.add(s);
		else if(!dup2.contains(s))
			dup2.add(s);			
		}
	
	System.out.println(dup2);
	}
	

}
