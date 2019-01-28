package JavaDemo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {

	public static void main(String[] args) {

		String[] arr1=new String[]{"aa","bb","cc","dd","ee","ff"};
		
		System.out.println("printing not shuffled array");
		for(String s:arr1){
			System.out.print(s+",");
		}
		System.out.println();
		System.out.println("printing shuffled array");
		
		List<String> list=Arrays.asList(arr1);
		//ArrayList<String> list=(ArrayList<String>) Arrays.asList(arr1);
		
		Collections.shuffle(list);
		list.forEach(el->System.out.print(el+","));
		
		Integer[] arr2=new Integer[]{1,2,3,4,5,6,7};
		System.out.println("printing the not shuffled array");
		for(int i:arr2)
			System.out.print(i+",");
		System.out.println();
		System.out.println("shuffled array");
		List<Integer> list2=Arrays.asList(arr2);
		Collections.shuffle(list2);
		list2.forEach(el->System.out.print(el+","));
		
		}
		
	}


