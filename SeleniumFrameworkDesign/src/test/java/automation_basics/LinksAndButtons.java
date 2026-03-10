package automation_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class LinksAndButtons {
		  
		static WebDriver driver;    

	  
		public static void main(String[] args) throws Throwable {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	 
			
			LinksAndButtons obj = new LinksAndButtons();  
	        obj.handle_basi_html();                       
	 
			
			driver.quit();
		}
		public void handle_basi_html() throws Throwable {

	 
			Thread.sleep(4000);
			driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html"); // navigating
																						// to
																						// the hyr totorials
	 
			Thread.sleep(4000); // hyr tutorls page
			driver.findElement(By.id("femalerb")).click();
			Thread.sleep(4000);
	 
			
			driver.findElement(By.id("spanishchbx")).click();
			Thread.sleep(4000);
	 
			driver.findElement(By.id("registerbtn")).click();
			Thread.sleep(4000);
			System.out.println(driver.findElement(By.xpath("//label[@id='msg']")).getText()); 


			driver.findElement(By.linkText("Click here to navigate to the home page")).click();   
			Thread.sleep(4000);                                                                
			}
		}

