package demopack;

public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java selenium automation";
		String[]words=str.split(" ");
		for(String word:words) 
		{
	System.out.print(new StringBuilder(word).reverse() + " ");
		}
	}
}
