package JavaDemo;

import java.util.ArrayList;

public class AnnotationDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("dfg");
		
		for(Object oj:list)
			System.out.println(oj);
		

	}

}
