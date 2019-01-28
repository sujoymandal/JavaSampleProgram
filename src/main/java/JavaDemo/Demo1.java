package JavaDemo;


interface DemoInterface{
	
	int i=10;
	 void print();
	 void demo1();
	 
}

class A implements DemoInterface{

	
	public void print() {
		System.out.println("its  an implemented method  "+i);
		
	}
	
	
	public void demo1(){
		System.out.println("its demo1 method");
	}
	
	public void classmethod(){
		System.out.println("its class method");
	}
	
}
public class Demo1  {

	
	
	public static void main(String[] args) {
		A a=new A();
		a.print();
		a.demo1();
		a.classmethod();

	}

	
}
