package JavaDemo7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingArrayAscendingOrder {

	public static void main(String[] args) {

		int[] arr={2,30,4,6,1,8,0,12,89,23};
		List<Integer> list=new ArrayList<Integer>();
	
		//Sorting using list
		for(int i=0;i<arr.length;i++){
			
			list.add(arr[i]);
		}
		System.out.println(list.toString());
		list.sort(null);
		System.out.println(list);
		
		//using sort method of Arrays
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//using sort algorithm
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
}
