package JavaDemo;

class X{
	void printX(){
		System.out.println("printing from X");
	}
}

class Y{
	void printY(){
		System.out.println("printing from Y");
	}
}

public class C {
	
	X x=new X();
	Y y=new Y();
	
	void printX(){
		x.printX();
	}

	
	void printY(){
		y.printY();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		c.printX();
		c.printY();
	}

}
