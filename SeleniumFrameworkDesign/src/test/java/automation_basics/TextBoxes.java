package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class TextBoxes {
		static WebDriver driver;  
	 
		public static void main(String[] args) throws Throwable {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	 
			
			TextBoxes obj = new TextBoxes();  
			obj.textboxes();
		}
	 
		public void textboxes() throws Throwable {
	 
			Thread.sleep(4000);
			driver.navigate().to("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin"); 
																													// to
																													// the
																													// git-hub
			// 1. id----locator
			driver.findElement(By.id("login_field")).sendKeys("testdata1");
			Thread.sleep(4000);
	 
			// 2. name----locator
			driver.findElement(By.name("password")).sendKeys("testdata1");
			Thread.sleep(4000);
		}	 
	}

