package JavaDemo5;

public interface Interace1 {

	public void print1();
	
	default public void log(){
		System.out.println("default method of interface1");
	}
	
}
