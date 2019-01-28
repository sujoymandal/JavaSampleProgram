package JavaDemo6;

import java.util.ArrayList;
import java.util.List;

public class FindingFrequencyOfDigit {

	public static void main(String[] args) {

		int input=1100100101;
		String str=String.valueOf(input);
		System.out.println(str);
		char[] arr=str.toCharArray();
		
		String zeros="";
		String ones="";
		for(char c:arr){
			if(c=='0')
				zeros=zeros+c;
			else
				ones=ones+c;
		}
		
		System.out.println("number of zeros :"+zeros.length()+"and the result is "+zeros);
		System.out.println("number of zeros :"+ones.length()+"and the result is "+ones);
	}

}
