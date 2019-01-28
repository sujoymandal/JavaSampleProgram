package JavaDemo5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComparingHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		// Same as map1
		HashMap<Integer, String> map2 = new HashMap<>();

		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		// Different from map1
		HashMap<Integer, String> map3 = new HashMap<>();

		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		HashMap<Integer, String> map4 = new HashMap<>();

		map4.put(4, "A");
		map4.put(8, "B");
		map4.put(9, "C");
		
		HashMap<Integer, String> map5 = new HashMap<>();

		map5.put(1, "X");
		map5.put(2, "Y");
		map5.put(3, "Z");

		System.out.println("comparing key value pair");
		System.out.println(map1.equals(map2)); // true
		System.out.println(map1.equals(map3)); // false
		System.out.println(map1.equals(map4));

		System.out.println("Comparing only keys");
		System.out.println(map1.keySet().equals(map5.keySet()));
		
		System.out.println("comparing value");
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map4.values())));

		List<String> list1 = new ArrayList<String>(map1.values());
		List<String> list2 = new ArrayList<String>(map4.values());
		System.out.println(list1.toString());
		System.out.println(list2.toString());
	}

}
