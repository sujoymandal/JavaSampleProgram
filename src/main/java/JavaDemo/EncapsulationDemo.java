package JavaDemo;

class Encap{
	
	private String name=null;
	private int roll;
	
	public void setName(String nm){
		this.name=nm;
		
	}
	
	public  String getName(){
		return this.name;
	}
	public void setRoll(int rl){
		if(rl<10){
			System.out.println("roll should be greater than 10");
			this.roll=10;
			
		}
		else this.roll=rl;
	}
	
	public int getRoll(){
		return this.roll;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Encap e=new Encap();
		e.setName("sujoy");
		System.out.println(e.getName());
		e.setRoll(2);
		System.out.println(e.getRoll());
		
		
	}

}
