package JavaDemo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingMapByValue {

	public static void main(String[] args) {

		HashMap<String,Integer> unsortMap=new HashMap<String,Integer>();
		
	    unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        
        for(Map.Entry<String, Integer> entry1:unsortMap.entrySet()){
        	System.out.println(entry1.getKey()+"-->"+entry1.getValue());
        }
        
        //Sorting by value
      
        List<Map.Entry<String,Integer>> list1=new ArrayList<Map.Entry<String,Integer>>(unsortMap.entrySet());
        //list1.add(unsortMap);
        
        System.out.println(list1);
        
        List<Map.Entry<String, Integer>> list2=new LinkedList<Map.Entry<String,Integer>>(unsortMap.entrySet());
       // list2.add(unsortMap);
        System.out.println(list2);
      }

	
	
}
