package JavaDemo3;



public class CallByValueDemo {

	public static void main(String[] args) {
		
		int i=5;
		System.out.println("Before calling the increment() method.."+i);
		
		increment(i);
		
		System.out.println("After calling the increment() method.."+i);
		

	}
	
	public static void increment(int val){
		
		System.out.println("Before increment the value.."+val);
		val++;
		System.out.println("After increment the value.."+val);
		
	}

}
