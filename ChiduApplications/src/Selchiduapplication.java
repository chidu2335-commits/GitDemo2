import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selchiduapplication {

	public static void main(String[] args) {
		
		// invoking Browser 
		//Chrome - ChromeDriver - Methods close get
		//Firefox - FirefoxDriver - methods close get
		//safari SaariDriver - methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		//chromedriver.exe- Chrome browser 
		//step to invoke chrome driver//
		//Selenium Manager
		
		WebDriver driver = new ChromeDriver();
				  
		driver.get("https://www.insightsonindia.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}
}
