package JavaDemo7;

public class ReverseNumber {

	public static void main(String[] args) {

		
		int i=786543;
		//using String and StringBuilder
		String ii=Integer.toString(i);
		System.out.println(ii);
		StringBuilder sb=new StringBuilder(ii);
		System.out.println(sb.reverse());
		Integer o=Integer.valueOf(new String(sb));
		System.out.println(o);
		
		//through divide logic
		int reverse=0;
		while(i!=0){
			
			int digit=i%10;
			reverse=reverse*10+digit;
			i=i/10;
		}
		System.out.println("reverse number :"+reverse);
	}
	

}
