package JavaDemo;

public class StringBufferAndStringBuilderWithString {

	public static void concat1(String s){
		s=s+" world";
	}
	
	public static void concat2(StringBuffer s){
		s=s.append(" world");
	}
	
	public static void concat3(StringBuilder s){
		s=s.append(" world");
	}
	
	public static void main(String[] args) {

		String s1=new String("hello");
		StringBuffer s2=new StringBuffer("hello");
		StringBuilder s3=new StringBuilder("hello");
		concat1(s1);
		concat2(s2);
		concat3(s3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
