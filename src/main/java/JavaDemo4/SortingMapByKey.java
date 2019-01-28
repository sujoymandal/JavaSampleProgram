package JavaDemo4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMapByKey {

	public static void main(String[] args) {

		HashMap<Integer, String> unsortMap = new HashMap<Integer, String>();

		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(6, "a");
		unsortMap.put(20, "c");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(8, "y");
		unsortMap.put(99, "n");
		unsortMap.put(50, "j");
		unsortMap.put(2, "m");
		unsortMap.put(9, "f");

		for(Map.Entry<Integer, String> entry1:unsortMap.entrySet()){
			System.out.println(entry1.getKey()+"-->"+entry1.getValue());
		}
		
		Map<Integer,String> sortedMap=new TreeMap<Integer,String>(unsortMap);
		
		for(Map.Entry<Integer, String> entry2:sortedMap.entrySet()){
			System.out.println(entry2.getKey()+"-->"+entry2.getValue());
		}
		
	}

}
