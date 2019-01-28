package JavaDemo4;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> hMap=new HashMap<String,String>();
		hMap.put("g", "A");
		hMap.put("x", "C");
		hMap.put("z", "B");
		hMap.put("a", "Z");
		hMap.put("b", "W");
		
		for(Map.Entry<String, String> entry:hMap.entrySet()){
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}
