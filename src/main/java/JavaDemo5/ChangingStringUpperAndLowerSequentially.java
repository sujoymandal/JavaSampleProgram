package JavaDemo5;

public class ChangingStringUpperAndLowerSequentially {

	public static void main(String[] args) {

		String input="abcdefghijk";
		String[] arr=input.split("");
		String output="";
		for(int i=0;i<arr.length;i++){
			
			if(i%2==0)
				output=output+arr[i].toUpperCase();
			else
				output=output+arr[i].toLowerCase();
			
		}
		
		System.out.println(output);
		
	}

}
