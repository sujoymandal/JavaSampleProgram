package JavaDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("wer");
//		for(String l:list){
//			System.out.println(l);
//		}
//		
	
		System.out.println("using iterator");
		//ListIterator <String> lit=list.listIterator();
		Iterator<String> it=list.iterator();
		System.out.println(list.toString());
		if(it.hasNext()){
			it.next();
			it.remove();
		}
		
		System.out.println(list.toString());
		
		
		//System.out.println("using list iterator");
		
		
		

	}

}
