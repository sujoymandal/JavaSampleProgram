package JavaDemo6;

import java.util.Scanner;

public class FindWordFrequencyInParagraph {

	public static void main(String[] args) {

		System.out.println("enter a sentence..");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("enter search string..");
		String search=sc.nextLine();
		int count=0;
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length;i++){
			if(search.equals(arr[i]))
				count++;
		}
		
		System.out.println("frequency of word "+search+" is "+count);
	}

}
