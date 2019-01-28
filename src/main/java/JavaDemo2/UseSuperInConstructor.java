package JavaDemo2;

class ParentClass{
	
	public ParentClass(){
		
		System.out.println("no arg. constructor..");
	}
	
	public ParentClass(String msg){
		
		System.out.println("arg. constructor with arg .."+msg);
	}
	
}


class ChildClass extends ParentClass{
	
	public ChildClass(){
		//super("argument");
		System.out.println("its child class constructor..");
	}
}

public class UseSuperInConstructor {

	public static void main(String[] args) {
		ChildClass ch=new ChildClass();
		

	}

}
