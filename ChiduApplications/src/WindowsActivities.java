import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args)
	
	//System.setProperty("webdriver.chrome.driver", "/User/rahulshetty/Documents/chromedriver");
	
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.navigate().back();
	driver.navigate().forward();
	}
}