package coreJava;

public class StaticVar {

	String name;			//Instance variable
	String address;
	static String city; //class variables
	static int i;
	static {
		city="Bangalore";
		i=0;
	}
	
	StaticVar(String name,String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() //instant methods
	{
	System.out.println(address+" "+city);
	}
	public static void getCity() 
	{
		System.out.println(city);
	}
	
	public static void main(String[] args)
	{
	StaticVar obj = new StaticVar("Bob","Marathalli");
	StaticVar obj1 = new StaticVar("Ram","Jayanagar");
	StaticVar obj2 = new StaticVar("Ram","Jayanagar");
	obj.getAddress();
	obj1.getAddress();
	StaticVar.i=4;
	obj.address="XYZ";
	}
}
