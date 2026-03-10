import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	//145, 146 video inheritance example like parent child class.
	//continue...parameterized constructor,this keyword usage.(PS,PS1,PS all class)
	//methods,variables)
		public void doThis()
		{
			System.out.println("I am here");	
			}
		@BeforeMethod
		public void beforeRun()
		{
			System.out.println("RUN me first");
		}
		@AfterMethod
		public void afterRun()
		{
			System.out.println("RUN me last");
		}
}

