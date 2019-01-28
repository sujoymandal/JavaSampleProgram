package JavaDemo4;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String,String>  lMap=new LinkedHashMap<String,String>();
		lMap.put("g", "A");
		lMap.put("x", "C");
		lMap.put("z", "B");
		lMap.put("a", "Z");
		lMap.put("b", "W");
		
		for(Map.Entry<String, String> entry:lMap.entrySet()){
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
	}

}
