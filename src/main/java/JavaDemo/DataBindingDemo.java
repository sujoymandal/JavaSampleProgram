package JavaDemo;

class Binding{
	static void print(){
		System.out.println("printing from class A");
	}
}

class B extends Binding{
	
	static void print(){
		System.out.println("printing from class B");
	}
}

class  Overload{
	
	void print(){
		System.out.println("simple print");
	}
	
	void print(int i){
		System.out.println("printing the passing number"+i);
	}
}

public class DataBindingDemo {

	public static void main(String[] args) {
		Binding a1=new Binding();
		a1.print();
		Binding a2=new B();
		a2.print();
		
		B b=new B();
		b.print();
		
		Overload o1=new Overload();
		o1.print();
		o1.print(4);

	}

}
