package demopack;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,0,1,2,3,3,8,7,5};
		Set<Integer>set = new LinkedHashSet<>(); 
		for (int num :arr)
		{
		set.add(num);
		}
		System.out.println(set);
	}
}
