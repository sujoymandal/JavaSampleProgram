package JavaDemo5;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("efg");
		
		list.forEach(el->System.out.println(el));
		
	}

}
