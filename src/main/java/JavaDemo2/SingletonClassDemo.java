package JavaDemo2;


class SingletonClass{
	
	static SingletonClass single=null;
	
	private SingletonClass(){
		
	}
	
	public static SingletonClass getInstance(){
		
		if(single==null){
			single=new SingletonClass();
			System.out.println("object created..");
		}
		return single;
	}
	
	public void print(){
		System.out.println("printing demo");
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {

		//SingletonClass cls=new SingletonClass();--not possible
		
		SingletonClass cls=SingletonClass.getInstance();
		
		SingletonClass cls2=SingletonClass.getInstance();
		
		cls.print();
		cls2.print();
		System.out.println(cls==cls2);
	}

}
