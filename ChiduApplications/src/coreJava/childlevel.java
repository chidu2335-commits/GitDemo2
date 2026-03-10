package coreJava;

//function overloading
//either argument count should be different 
// or argument data type should be different

public class childlevel extends childClassDemo {
	
	public void getData(int a) 
	{
		System.out.println(a);
	}
	public void getData(String a) 
	{
		System.out.println(a);
	}
	public void getData(int a, int b) 
	{
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
	
		childlevel cl = new childlevel();
		cl.getData(2);
		cl.getData("hello");
		cl.getData(7, 5);
	}

}
