package coreJava;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int balance =500000;
				int withdrew =4500;
				if (withdrew<=balance) {
					balance -=withdrew;
					System.out.println("withdrew successful");					
				}
				else 
				{
					System.out.println("insufficient balance");
				}
				System.out.println("Balance: " + balance);
	}

}
