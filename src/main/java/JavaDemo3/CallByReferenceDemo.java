package JavaDemo3;

class Number{
	int x;
}

public class CallByReferenceDemo {

	public static void main(String[] args) {

		Number n=new Number();
		n.x=10;
		
		System.out.println("Before calling the increment() method.."+n.x);
		
		increment(n);
		
		System.out.println("After calling the increment() method.."+n.x);
		
	}
	
	public static void increment(Number y){
		
		System.out.println("Befoer increment the value.."+y.x);
		
		y.x++;
		System.out.println("After increment the value.."+y.x);
	}

}
