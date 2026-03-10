import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr2  = {1,2,4,5,6,7,8,9,10,115};
	    //2,4,6,8,10
		//check if any has multiple of 2;
		for(int i=0;i<arr2.length;i++)
		{
			if (arr2[i] % 2 == 0)
			{	
		System.out.println(arr2[i]);
		break;
			}
			else
			{
				System.out.println(arr2[i] +"is not multiple of 2");
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("insights");
		a.add("IAS");
		a.add("academy");
		a.add("Vision IAS");
		a.get(3);
		System.out.println(a.get(3));
		//create object of the class - object.method
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*************");
		for(String val:a) {
			System.out.println(val);
		}
		//item is present in ArrayList
		System.out.println(a.contains("Vision IAS"));
			
	}
}
