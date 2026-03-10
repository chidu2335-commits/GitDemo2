 package coreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	/*	int a;
	 *  a=4;
	 */
		
		//-A container which stores multiple values of same data type

		int a[] = new int[6];//declare an array and allocates memory for the  
		a[0]=2;
		a[1]=6;
		a[2]=1;
		a[3]=9;
		a[4]=12;//initilased values into array
		
		int b[] = {1,4,3,5,7,8};
		for (int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);//retrive values present in this array
		}
		
		//public private protected default -
		//default : access method anywhere in package
		//public : variable/method as public then you will have access across all 
		//private : you can not access method or variable out side the class or same package as well
		//protected :variable/method as private: you can access those in subclasses only.  
	
	}

}
