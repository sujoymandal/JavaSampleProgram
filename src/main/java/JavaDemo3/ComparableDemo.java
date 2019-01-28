package JavaDemo3;

class HDTV implements Comparable<HDTV>{

	String name;
	int size;
	
	public HDTV(String name,int size){
		
		this.name=name;
		this.size=size;
		
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String getName(){
		return this.name;
	}
	@Override
	public int compareTo(HDTV tv) {
		
		if(this.getSize()>tv.getSize())
			return 1;
		else if(this.getSize()==tv.getSize())
			return 0;
		else
			return -1;
		
		
	}
	
	
}


public class ComparableDemo {

	public static void main(String[] args) {

		HDTV tv1=new HDTV("sumsung",36);
		HDTV tv2=new HDTV("LG",30);
		if(tv1.compareTo(tv2)==1)
			System.out.println(tv1.getName()+" is better than "+tv2.getName());
		else if(tv1.compareTo(tv2)==0)
			System.out.println(tv1.getName()+" and "+tv2.getName()+" both are same ");
		else
			System.out.println(tv2.getName()+" is better than "+tv1.getName());
	}

}
