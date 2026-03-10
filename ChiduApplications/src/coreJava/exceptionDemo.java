package coreJava;
//one try can be followed by multiple catch blocks
//catch should be an immidiate block after try
//319 video lecture

public class exceptionDemo {
	
	public static void main(String[] args) {
	// 3-lines -try catch mechanism
	
	int b=7;
	int c=0;
	//try - catch mecanism
	try
	{
		//purchased failed 
	int k=b/c;
		
		int arr[] = new int [5];
		
System.out.println(arr[7]);
}
	catch(ArithmeticException et)
	{
		System.out.println("I catched the Arthmetic exception"); 
	}
	catch(IndexOutOfBoundsException ets)
	{
		System.out.println("I catched the IndexOutBoundException");
	}
	catch(Exception e)
	{
		System.out.println("I catched the error/exception");
	}
	finally
	{
		System.out.println("delete cookies"); 	//this block is executed irrespective of exception thrown or not 
	}
	
	
	
}
}