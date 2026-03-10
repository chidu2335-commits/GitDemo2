package coreJava;

import java.util.ArrayList;

public class arrayListexample {
//can accept duplication values
	//ArrayList,LinkedList,vector- Implemenation List interface
	//Array Have fixed size size where as arraylist can grow dynamicaly
	//and you can insert any value in any index  
	
	
	public static void main(String[] args) {
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("Rahul");
		a.add("Java");
		a.add("java");
		System.out.println(a);
		a.add(0,"student"); 
		System.out.println(a);
		/*a.remove(1);
		a.remove("Java");
		System.out.println(a);*/
		System.out.println(a.get(2));
		//testing 
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
	}

}
