package JavaDemo3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

public class CheckDuplicateInList {

	public static void main(String[] args) throws IOException {
		
		System.out.println("taking input from console by Scanner ");
		Scanner sc=new Scanner(System.in);
//		String input=sc.nextLine();
//		System.out.println(input);
//		
//		System.out.println("taking input from console by BufferReader ");
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String bf=br.readLine();
//		System.out.println(bf);
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//List<Integer> list=new ArrayList<Integer>();
		//int i;
		//List<Integer> list=new ArrayList<Integer>();
//		list.add(3);
//		list.add(5);
//		list.add(5);
//		list.add(9);
//		list.add(9);
//		list.add(0);
		
		List<Integer> list=Lists.newArrayList(1,2,3,2,4,5,6,1,2,5,8);
		
		System.out.println(list);
		
		Set<Integer> nodup=new HashSet<Integer>();
		
		for(int e:list){
			if(!nodup.add(e)){
				System.out.println(e+" --its a duplicate element");
			}
		}
		
		System.out.println(nodup);
		List<Integer> dup=new ArrayList<Integer>();
		dup=(List<Integer>) list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dup);
		

	}

}
