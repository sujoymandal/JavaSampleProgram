package JavaDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapHasTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hasht=new Hashtable<Integer,String>();
		
		hasht.put(1, "abc1");
		hasht.put(2, "abc2");
		hasht.put(3, "abc3");
		//hasht.put(null, "xyz");-->will give error
		
		for(Map.Entry m:hasht.entrySet()){
			System.out.println(m.getKey()+"--->"+m.getValue());
		}
		
		System.out.println("iterate by keys...");
		for(int k:hasht.keySet()){
			System.out.println(k+"--->"+hasht.get(k));
		}
		
		
		HashMap<Integer,String> hashm=new HashMap<Integer,String>();
		hashm.put(1, "abc1");
		hashm.put(2, "abc2");
		hashm.put(3, "abc3");
		hashm.put(null, "xyz");
	//List<Integer> key=new ArrayList<Integer>();
		
		for(Map.Entry m:hashm.entrySet()){
			System.out.println(m.getKey()+"--->"+m.getValue());
		}
		
		
		//System.out.println("iterate by keys..");
		
		/*for(int k:hashm.keySet()){
			System.out.println(k+"--->"+hashm.get(k));
		}
		*/

	}

}
