package JavaDemo2;

import org.testng.internal.collections.Pair;

class ReturnValue{
	
	public String name;
	public int sal;
	
	public ReturnValue(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	
	
}

class SentValue{
	
	
	public ReturnValue sent(){
	
		String n="abc";
		int sal=12345;
	ReturnValue r=new ReturnValue(n,sal);
	return r;
	}
	
	public Pair returnPair(){
		
		Pair<String,Integer> p=new Pair<String,Integer>("xyz",4);
		return p;
		
	}
}


public class ReturnMultipleValue {

	public static void main(String[] args) {
		
		SentValue s=new SentValue();
						
		System.out.println(s.sent().name);
		System.out.println(s.sent().sal);
		
		System.out.println(s.returnPair().);
		

	}

}
