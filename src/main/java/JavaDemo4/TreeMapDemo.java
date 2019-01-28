package JavaDemo4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<String,String> tMap=new TreeMap<String,String>();
		tMap.put("f", "F");
		tMap.put("a", "A");
		tMap.put("c", "C");
		tMap.put("z", "Z");
		
		//System.out.println(tMap);
		for(Map.Entry<String, String> entry:tMap.entrySet()){
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
	}

}
