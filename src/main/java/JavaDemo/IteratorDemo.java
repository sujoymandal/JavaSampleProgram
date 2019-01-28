package JavaDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(67);
		list.add(65);
		list.add(2, 90);
		
		System.out.println(list.toString());
		
		for(int i:list){
			System.out.println(i);
		}
		
		Iterator<Integer> ii=list.iterator();
		System.out.println("printing through iterator");
		while(ii.hasNext()){
			System.out.println(ii.next());
		}
		
		ListIterator<Integer> lt=list.listIterator();
		System.out.println("printing through list iterator..");
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		
	}

}
