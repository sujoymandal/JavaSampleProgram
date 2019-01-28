package JavaDemo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingListDiffWay {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("gdf");
		list.add("lkj");
		
		System.out.println("Iterating list by clasic for loop");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("iterating through enhance for loop..");
		
		for(String s:list){
			System.out.println(s);
		}
		
		System.out.println("Iterating through Iterator..");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("iterator through ListIterator..");
		
		ListIterator<String> lt=list.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		
		System.out.println("iterator through forEach lambda method ..");
		
		list.forEach(el ->System.out.println(el));

	}

}
