package JavaDemo;

public class StringDemo {

	public static void main(String[] args) {

		String s1="abc";
		String s2="abc";
		String aa="automationtest";
		
		String sa1=new String("xyz");
		String sa2=new String("xyz");
//		System.out.println(s1);
//		System.out.println(sa1);
		
		
		System.out.println(s1==s2);
		System.out.println(sa1==sa2);
		System.out.println(sa1.equals(sa2));
		
		String ss=sa1.concat(s1);
		System.out.println(ss);
		
		System.out.println(aa);
		aa=aa.substring(10);
		System.out.println(aa);
		
	}

}
