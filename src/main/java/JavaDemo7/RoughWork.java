package JavaDemo7;

import java.util.LinkedHashMap;

public class RoughWork {

	public static void main(String[] args) {

		String input="javapracticedemo";
		char[] arr=input.toCharArray();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i], i);
		}
		map.clear();
		System.out.println(map.keySet());
	}

}
