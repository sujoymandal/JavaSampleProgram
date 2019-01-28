package JavaDemo4;

public class SubStringDemo {

	public static void main(String[] args) {

		String s="new String";
		System.out.println(s.substring(4,7));
		
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.substring(4,7));
	}

}
