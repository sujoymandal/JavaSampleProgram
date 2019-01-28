package JavaDemo4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConversionBtnMaps {

	public static void main(String[] args) {

		Map<String,Integer> hMap=new HashMap<String,Integer>();
		
		hMap.put("a", 3);
		hMap.put("d", 7);
		hMap.put("c", 9);
		hMap.put("b", 10);
		
		for(Map.Entry<String, Integer> entry1:hMap.entrySet()){
			System.out.println(entry1.getKey()+"-->"+entry1.getValue());
		}
		
		System.out.println("converting hash map to tree map");
		Map<String,Integer> tMap=new TreeMap<String,Integer>(hMap);
		for(Map.Entry<String, Integer> entry2:tMap.entrySet()){
			System.out.println(entry2.getKey()+"-->"+entry2.getValue());
		}
		
		System.out.println("converting hash map to linked hash map");
		
		Map<String,Integer> lMap=new LinkedHashMap<String,Integer>(hMap);
		
		for(Map.Entry<String, Integer> entry3:lMap.entrySet()){
			System.out.println(entry3.getKey()+"-->"+entry3.getValue());
		}
		
		
		
	}

}
