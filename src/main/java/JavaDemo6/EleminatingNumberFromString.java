package JavaDemo6;

public class EleminatingNumberFromString {

	public static void main(String[] args) {

		String input="3rc23uu23desaqwiuu1q18";
		char arr[]=input.toCharArray();
		String output="";
		for(char c:arr){
			if(!Character.isDigit(c))
				output=output+c;
		}
		System.out.println(input);
		System.out.println(output);
	}

}
