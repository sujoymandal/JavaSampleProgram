package JavaDemo6;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {

		System.out.println("Enter a  number..");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("Factorial is :"+fact(input));
		
	}
	
	public static int fact(int i){
		if(i==0)
			return 0;
		else if (i==1)
			return 1;
		else
			return i*fact(i-1);
		
	}

}
