package demopack;
import coreJava.CentralTraffic;
import coreJava.ContinentalTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		
		AustralianTraffic at=new AustralianTraffic();
		ContinentalTraffic ct=new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
		}
	public void walkonsymbol()
	{
		System.out.println("flash Yellow implemantation");
	
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

}
