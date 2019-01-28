package JavaDemo;

import java.util.ArrayList;
import java.util.List;

public class WraperClassDemo {

	public static void main(String[] args) {
		
		//Autoboxing
		char ch='a';
		Character ch_obj=ch;
		System.out.println(ch_obj);
		
		int i=2;
		Integer i_obj=i;
		System.out.println(i_obj);
		
		//Autoboxing in collection framework
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(i);
		list.add(44);
		list.add(i_obj);
		System.out.println("printing from list");
		for(Integer ii:list)
			System.out.println(ii);
		
		
		//Unboxing
		Integer i_obj2=90;
		int ip=i_obj2;
		System.out.println(ip);
		
		int j=list.get(2);
		System.out.println(j);
		
		Integer iii=new Integer(8);
		int ij=iii;
		System.out.println(ij);

	}

}
