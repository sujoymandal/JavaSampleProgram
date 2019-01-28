package JavaDemo4;

public class ConvertingToStringArray {

	public static void main(String[] args) {

		String input="hi how are you";
		String[] s1=input.split(" ");
		for(String s:s1){
			System.out.println(s);
		}
		
		for(int i=0;i<s1.length;i++){
			System.out.print(s1[i]+",");
		}
	}

}
