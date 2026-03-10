package small;

public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {22,58,99,1,66};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println("smallest number is present in given array : " + max);
		
		
		
	}

}
