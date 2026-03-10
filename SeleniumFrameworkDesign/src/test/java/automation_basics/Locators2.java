package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Locators2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin");
 
// 1. id----locator
		driver.findElement(By.id("login_field")).sendKeys("testdata1");
		Thread.sleep(4000);   
 
// 2. name----locator
		driver.findElement(By.name("password")).sendKeys("testdata1");
		Thread.sleep(4000);
 
// 3. classname----locator
		//WebElement: Represents an HTML element on a webpage
		WebElement classnamevalue = driver.findElement(By.className("header-logo"));
		if (classnamevalue.isDisplayed()) {
			System.out.println("Logo has been displayed");
		}
 
		Thread.sleep(4000);
 
// 4. linktext----locator
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(4000);
		driver.navigate().back();   
		Thread.sleep(4000);
 
// 5. partiallinktext----locator
		driver.findElement(By.partialLinkText("Create an")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
 
// 6. Tagname----locator
		driver.findElement(By.id("login_field")).clear();   
		Thread.sleep(4000);
		WebElement tagnamevalue = driver.findElement(By.tagName("label"));
		if (tagnamevalue.isDisplayed()) {
			System.out.println("username text has been displayed");
		}
 
// 7. css----locator     
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		Thread.sleep(4000);
 
// 8. xpath----locator
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(4000);
	}
 
}
	
