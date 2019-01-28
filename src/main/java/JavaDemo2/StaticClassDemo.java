package JavaDemo2;


class CarParts{
	
	public static String name="static variable of enclosed class..";
	String name2="non static variable of enclosed class..";
	
	static class Wheel{
		
		Wheel(){
			
			System.out.println("Wheel class object created..");
		}
		
		public void accessingStaticVariable(){
			
			System.out.println(name);
			
		}
	}
	
	CarParts(){
		System.out.println("CraParts Class object created..");
	}
}

public class StaticClassDemo {

	public static void main(String[] args) {
		
		CarParts car=new CarParts();
		CarParts.Wheel wheel=new CarParts.Wheel();
		wheel.accessingStaticVariable();
		

	}

}
