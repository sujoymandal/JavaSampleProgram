package JavaDemo6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int[] arr=new int[]{1,2,3,4,3,2,5,6,2,9,9,8,7,88,0};
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> dupList=new ArrayList<Integer>();
		for(int i:arr){
			list.add(i);
		}
		System.out.println(list.toString());
		Set<Integer> set=new HashSet<Integer>();
		for(int j:list){
			if(!set.add(j)&&!dupList.contains(j))
				//System.out.println("duplicate element is :"+j);
				dupList.add(j);
		}
		System.out.println("duplicate elements are : "+dupList.toString());
	}

}
