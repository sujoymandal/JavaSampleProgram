package JavaDemo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStringList {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("def");
		list.add("mnk");
		list.add("iju");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(0);
		list2.add(1);
		
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
	}

}
