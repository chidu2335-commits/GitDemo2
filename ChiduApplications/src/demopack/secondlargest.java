package demopack;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr= {10,2,15,35};
			int first=Integer.MIN_VALUE;
			int second=Integer.MIN_VALUE;
			
			for(int num :arr) {
				if(num>first) {
					second = first;
					first = num;
				
			} else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }	
}
		
