package JavaDemo5;

class DefaultMethodClass implements Interace1,Interface2{

	@Override
	public void print2() {
		System.out.println("its a implementing method of interface1");
		
	}

	@Override
	public void print1() {
		System.out.println("its a implementing method of interface2");
		
	}

	@Override
	public void log() {
		System.out.println("its a default method implemention");
	}
	
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		DefaultMethodClass demo1=new DefaultMethodClass();
		demo1.print1();
		demo1.print2();
		demo1.log();

	}

}
