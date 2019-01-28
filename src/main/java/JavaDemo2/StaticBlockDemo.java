package JavaDemo2;

class StaticBlock{
	
	static{
		System.out.println("its a static block and will be invoked before object creation..");
	}
	
	StaticBlock(){
		System.out.println("ïts printing from constructor..");
	}
}


public class StaticBlockDemo {

	public static void main(String[] args) {
		StaticBlock sb=new StaticBlock();
		

	}

}
