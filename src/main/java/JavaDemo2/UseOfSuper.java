package JavaDemo2;

class Parent{

	public String name="its Parent claass  variable";
	
	public void print(){
		System.out.println("printing from parent class..");
	}
	
}

class Child extends Parent{
	
	String name="its child class variable";
	
	@Override
	public void print(){
		System.out.println("its printing from child class..");
		System.out.println("printing child class variable "+name);
		System.out.println("printing parent class variable "+super.name);
		//System.out.println("calling parent class method ");
	}
	
	
	public void parentMethod(){
		super.print();
		
	}
}
public class UseOfSuper {

	public static void main(String[] args) {


		Child ch=new Child();
		ch.print();
		ch.parentMethod();
		
		
	}

}
