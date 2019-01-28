package JavaDemo6;

public class ReversingWordOfSentence {

	public static void main(String[] args) {

		String input="who are you?";
		String output="";
		StringBuilder sboutput=new StringBuilder("");
		String[] arr=input.split(" ");
		for(String s:arr){
			StringBuilder sb=new StringBuilder(s);
			sb=sb.reverse();
			output=output+sb+" ";
			//sboutput=sboutput.append(sb).append(" ");--another way
		}
		//String output=new String(sboutput);
		System.out.println(output.trim());
	}

}