package JavaDemo;

public class SubclassDemo extends AbstractClassWithMainMethod{

	public static void main(String[] args) {
		SubclassDemo cc=new SubclassDemo();
		cc.print();
	}

	@Override
	void print() {
		System.out.println("its implemented method of abstract class");
		
	}

}
