package JavaDemo;


class Math{
	
	public void add(int n1,int n2){
		
		int sum=n1+n2;
		System.out.println("sum is :"+sum);
	}
	
	
	public void add(int n1,int n2,int n3){
		int sum=n1+n2+n3;
		System.out.println("sum is :"+sum);
	}
	
	
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Math m=new Math();
		m.add(5, 9);
		m.add(3, 4, 6);

	}

}
