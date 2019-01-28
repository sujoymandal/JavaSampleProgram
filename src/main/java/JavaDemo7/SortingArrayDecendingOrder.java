package JavaDemo7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayDecendingOrder {

	public static void main(String[] args) {

		Integer arr[]={5,3,4,1,78,9,0,34,2,54,76};
		//Unfortunately, for a primitive array, there is no direct way to sort in descending order

		//List<Integer> list=new ArrayList<Integer>();
				
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
