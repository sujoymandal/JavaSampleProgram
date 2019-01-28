package JavaDemo5;

class DefaultMethodClaass2 implements Interace1,Interface2{

	@Override
	public void print2() {
		System.out.println("its implementation of interface2 method");
		
	}

	@Override
	public void print1() {
		
		System.out.println("its implementation of interface2 method");
	}

	@Override
	public void log() {
		
		Interace1.super.log();
		Interface2.super.log();
	}
	
}

public class DefaultMethodDemo3 {

	public static void main(String[] args) {
		
		DefaultMethodClaass2 cc=new DefaultMethodClaass2();
		cc.print1();
		cc.print2();
		cc.log();
	}

}
