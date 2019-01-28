package JavaDemo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingDuplicateBtnTwoList {

	public static void main(String[] args) {

		List<String> list1=new ArrayList<String>();
		list1.add("abc");
		list1.add("def");
		list1.add("xyz");
		list1.add("klm");
		
		System.out.println(list1.toString());
		
		List<String> list2=new ArrayList<String>(Arrays.asList("abc","hgy","pol","iut","lko","poi","klm"));
		List<String> duplist=new ArrayList<String>();
		for(String el:list1){
			if(list2.contains(el))
				duplist.add(el);
		}
		System.out.println("duplicate elements are :"+duplist.toString());
	}

}
