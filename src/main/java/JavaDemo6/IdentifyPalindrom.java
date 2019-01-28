package JavaDemo6;

import java.util.Scanner;

public class IdentifyPalindrom {

	public static void main(String[] args) {

		System.out.println("Enter a string...");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(input);
		
		StringBuilder sb=new StringBuilder(input);
		String reverese =new String(sb.reverse());
		System.out.println(input.equals(reverese));
		
	}

}
