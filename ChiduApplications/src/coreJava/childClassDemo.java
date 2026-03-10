package coreJava;

public class childClassDemo extends parentClassdemo {
	//298, 299 vedio lecture
	public void audiosystem()
	{
		System.out.println("new audio child");
	}
	

	public void engine() 
	{
			System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println("colour");
	}
	public static void main(String[] args) {
	
		childClassDemo cd = new childClassDemo();
		cd.colour();
		cd.breaks();
		cd.audiosystem();//function overriding-both have method same ,name same signature same parameter

	}

}
