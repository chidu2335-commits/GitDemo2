package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class AlertBox {
	static WebDriver driver;  
 
	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
 
		
		AlertBox obj = new AlertBox();
		obj.alerts();
 
		
		driver.quit();
	}
 
	public void alerts() throws Throwable {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
 
     
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(4000);// Wait for the alert to appear
		driver.switchTo().alert().accept(); 
		Thread.sleep(4000);
	}
}
