package JavaDemo;


class Parent{
	
	public void print(){
		System.out.println("printing from parent class");
	}
	
	
	public void add(int n1,int n2){
		int sum=n1+n2;
		System.out.println("sum is :"+sum);
	}
}


class Child extends Parent{
	
	public void show(){
		System.out.println("its a method of child class");
	}
	
	public void print(){
		System.out.println("printing from child class");
	}
	
	
	public void add(int n1,int n2,int n3){
		
		int sum=n1+n2+n3;
		System.out.println("sum is :"+sum);
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		
		Child ch=new Child();
		ch.print();
		ch.add(5, 6);
		ch.add(4, 5, 9);

	}

}
