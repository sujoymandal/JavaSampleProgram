package JavaDemo7;

import java.util.Arrays;

public class FindTwoMaxValueInArray {

	public static void main(String[] args) {

		int arr[]={5,6,3,4,2,8,19,81,90,78,23,109};
		
		//first approach
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Two max numbers are :"+arr[arr.length-1]+" and "+arr[arr.length-2]);
		
		//second approach
		int arr1[]={54,62,39,41,222,82,19,81,90,78,23,109};
		
		int maxOne=0;
		int maxTwo=0;
		for(int n:arr1){
			if(maxOne<n){
				maxTwo=maxOne;
				maxOne=n;
			}
			else if(maxTwo<n){
				maxTwo=n;
			}
		}
		
		System.out.println("Two max numbers are :"+maxOne+" and "+maxTwo);
	}

}
