package coreJava;

public class constructorDemo {
//306 ,307 vedio lecture,constructor lecturer
	
	//will not return any values
	//name of constructor should be the class name 
	
	public constructorDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am the constructor lecturer");
	}
	//parameterised constructor
	
	public constructorDemo(int a,int b)
	{
		System.out.println("I am in the parameterised constructor");
		int c=a+b;
		System.out.println(c);
	}
	public constructorDemo(String str)
	{
		System.out.println("str");
	}	
	public void getdata()
	{
		System.out.println("i am the method");
	}
	
	
	public static void main(String[] args) {
		
// block of code when ever an object is created
		constructorDemo cd= new constructorDemo();
		constructorDemo cds= new constructorDemo("hello");
		constructorDemo c= new constructorDemo(4,5);
		//compiler will call implicit constructor(default)if you have not defined any constructor block
		//when ever you created an object constructor is called		
	}
}
