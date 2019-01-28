package JavaDemo5;

class DefaultClassDemo2 implements Interace1{

	@Override
	public void print1() {
		System.out.println("its implementing the interface method");
		
	}
	
}
public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		DefaultClassDemo2 demo2=new DefaultClassDemo2();
		demo2.print1();
		demo2.log();

	}

}
