package automation_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
@SuppressWarnings("unused")
public class ImplicitWait {
	static WebDriver driver;
 
	@SuppressWarnings("static-access")
	ImplicitWait(WebDriver driver) { // Constructor
		this.driver = driver;
	}
 
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver(); // Launch browser
		driver.manage().window().maximize(); // Maximise the window
		ImplicitWait obj = new ImplicitWait(driver);
		obj.implicitwait();
	}
 
	@SuppressWarnings("deprecation")
	public void implicitwait() {
		
 
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
 
		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
 
		driver.findElement(By.id("btn1")).click();
 
		driver.findElement(By.id("txt1")).sendKeys("test1");
 
		driver.findElement(By.id("btn2")).click();
 
		driver.findElement(By.id("txt2")).sendKeys("test1");
 
	}
}