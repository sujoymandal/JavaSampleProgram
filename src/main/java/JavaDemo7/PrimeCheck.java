package JavaDemo7;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {

		System.out.println("enter the number..except 0 and 1");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<num-1;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		
		if(flag==true)
			System.out.println("its prime..");
		else
			System.out.println("its not prime..");
		
	}

}
