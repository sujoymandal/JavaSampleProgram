package JavaDemo;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("zbc3");
		
		list.forEach((element)->System.out.println(element));
		list.forEach((element)->System.out.println(element.length()));
		
		for(String s:list){
			if(s.startsWith("a")){
				//System.out.println(s);
				s.replace("a", "xyz");
				System.out.println(s);
			}
		}
		
	}

}
