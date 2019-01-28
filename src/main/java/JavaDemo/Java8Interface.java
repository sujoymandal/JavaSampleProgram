package JavaDemo;

interface Interface1{
	default void show(){
		System.out.println("default method of interface1");
	}	
	
	void print();
}

interface Interface2{
	default void show(){
		System.out.println("default method of interface2");
	}
	
	static void static_method(){
		System.out.println("printing form static method..");
	}
	
}

class ClassDemo2 implements Interface1{

	@Override
	public void print() {
		System.out.println("printing from ClassDemo2");
		
	}
	
	
}

public class Java8Interface implements Interface1,Interface2{

	public static void main(String[] args) {
		
		Java8Interface ji=new Java8Interface();
		ji.show();
		ji.print();
		Interface2.static_method();
		
		ClassDemo2 cd=new ClassDemo2();
		cd.print();
		cd.show();

	}

		
	public void show() {
	
		System.out.println("printing from class");
		//Interface1.super.show();
		//Interface2.super.show();
	}


	@Override
	public void print() {
		System.out.println("print method of class");
		
	}
	
	

}
