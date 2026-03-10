package coreJava;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		boolean flag =true;
		
		for (int i=2;i<=num/2;i++) {
			if (num % i==0) {
				flag=false;
				break;
			}}
		if (flag)
			System.out.println("Prime");
		else
		System.out.println("Not Prime");
	
	}
	}


