package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
 
public class explicitwait {
	static WebDriver driver;  
 
	@SuppressWarnings("static-access")
	explicitwait(WebDriver driver) { 
		this.driver = driver;
	}
 
	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		explicitwait obj = new explicitwait(driver);
		obj.explicitwait();
	}
 
	public void explicitwait() {
 
		
 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 
		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
 
		driver.findElement(By.id("btn1")).click();
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
 
		driver.findElement(By.id("txt1")).sendKeys("test1");
 
		driver.findElement(By.id("btn2")).click();
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
 
		driver.findElement(By.id("txt2")).sendKeys("test1");
 
	}
}