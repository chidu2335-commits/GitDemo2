import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {


		    public static void main(String[] args) {

		    	WebDriver driver = new ChromeDriver();
		    	driver.get("https://meditrack-stage-frontend.web.app/");
		    	driver.manage().window().maximize();

		    	driver.findElement(By.id("username")).sendKeys("jaya");
		    	driver.findElement(By.id("password")).sendKeys("Jaya@123");
		    	driver.findElement(By.id("loginButton")).click();
		    }
		   }
		
	
