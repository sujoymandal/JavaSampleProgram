package JavaDemo;

class Encap1{
	private String name;
	private int sal;
	
//	Encap1(String name,int sal){
//		this.name=name;
//		this.sal=sal;
//	}
//	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}

public class EncaptulationDemo {

	public static void main(String[] args) {

		Encap1 e1=new Encap1();
		//System.out.println(e1.getName());
		e1.setName("xyz");
		System.out.println(e1.getName());
		
	}

}
