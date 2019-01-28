package JavaDemo5;

public class FindMinAndMaxValue {
	
	public static void main(String[] args) {
		int[] arr=new int[]{20,3,4,121,5,6,4,3,1};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
		}
		
		System.out.println("minimum value is :"+min);
		for(int j=0;j<arr.length;j++){
			if(max<arr[j])
				max=arr[j];
		}
		System.out.println("maxximum value is :"+max);
	}
	
	
}
