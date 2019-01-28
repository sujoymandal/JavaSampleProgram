package JavaDemo;

public class EqualMethodDemo {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		//int k=i;
		if(i==j)
			System.out.println("equal  ");
		else
			System.out.println("not equal");
		
		Integer ii=11;
		Integer jj=10;
		System.out.println(ii.equals(jj));
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer j2=i2;
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(j2.equals(i1));
		System.out.println(j2==i1);

	}

}
