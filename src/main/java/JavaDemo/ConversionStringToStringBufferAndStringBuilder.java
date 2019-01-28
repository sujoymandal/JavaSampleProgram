package JavaDemo;

public class ConversionStringToStringBufferAndStringBuilder {

	public static void main(String[] args) {

		String str=new String("hello");
		StringBuffer bstr=new StringBuffer(str);
		bstr.reverse();
		System.out.println(str);
		System.out.println(bstr);
		
		String strnew=bstr.toString();
		System.out.println(strnew);
		
		StringBuilder bldstr=new StringBuilder(strnew);
		bldstr.reverse();
		String str22=new String(bldstr);
		System.out.println(str22);
		
	}

}
