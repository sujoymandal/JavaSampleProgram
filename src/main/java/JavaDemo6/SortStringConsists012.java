package JavaDemo6;

public class SortStringConsists012 {

	public static void main(String[] args) {

		String input="01202010201000120200210122";
		String output="";
		String zeros="";
		String ones="";
		String twos="";
		char[] arr=input.toCharArray();
		for(char c:arr){
			if(c=='0')
				zeros=zeros+c;
			else if(c=='1')
				ones=ones+c;
			else if(c=='2')
				twos=twos+c;
		}
		
		output=zeros+ones+twos;
		System.out.println(output);
		
	}

}
