package JavaDemo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {

		System.out.println("Enter the 1st string..");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter the second string");
		String s2 = sc.nextLine();
		System.out.println(checkAnagram(s1, s2));

	}

	public static Boolean checkAnagram(String s1, String s2) {
		// Boolean flag=true;
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		if (!(s1.length() == s2.length())) {
			return false;
		}
		else
		{
			list1 = Arrays.asList(s1.split(""));
			list2 = Arrays.asList(s2.split(""));
			for (String s : list1) {
				if (!list2.contains(s)) {
					return false;
				}
			}
			return true;
			
		}

		
	}

}
