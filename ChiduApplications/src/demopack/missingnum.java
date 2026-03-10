package demopack;

public class missingnum {

		public static void main(String[]args) {
			int arr[]= {1,2,3,5};
			int n=5;
			int sum = n*(n+1)/2;
			int arrSum=0;
			for(int i:arr) {
				arrSum =+1;
			}
			System.out.println("missing: " + (sum - arrSum));
	}
}
