package JavaDemo4;

class Singletone {

	public static Singletone single = null;

	private Singletone() {

	}

	public static Singletone getInstance(){
		if(single==null){
			System.out.println("object created..");
			single= new Singletone();
		}
		return single;
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {
		
		Singletone s1=Singletone.getInstance();
		Singletone s2=Singletone.getInstance();

	}

}
