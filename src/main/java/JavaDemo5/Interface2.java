package JavaDemo5;

public interface Interface2 {
	
	public void print2();
	default public void log(){
		System.out.println("default method of interface2");
	}
		
}
