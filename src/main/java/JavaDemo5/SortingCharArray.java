package JavaDemo5;

import java.util.Arrays;

public class SortingCharArray {

	public static void main(String[] args) {

		char[] arr=new char[]{'a','f','k','c','r','t'};
		
		System.out.println("unsorted char array..");
		for(char c:arr)
			System.out.print(c+",");
		
		System.out.println("printing sorted char array");
		Arrays.sort(arr);
		for(char c:arr)
			System.out.print(c+",");
		
		System.out.println("sorting between two index..");
		char[] arr1=new char[]{'e','r','t','o','p','a','g'};
		
		Arrays.sort(arr1,2,6);
		for(char c:arr1)
			System.out.print(c+",");
		
		System.out.println("sorting int array");
		int[] arr3=new int[]{2,4,5,6,9,12,34,53,7};
		Arrays.sort(arr3);
		for(int i:arr3)
			System.out.print(i+",");
	}

}
