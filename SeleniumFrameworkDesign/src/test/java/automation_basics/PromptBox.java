package automation_basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class PromptBox {
	static WebDriver driver; 

 
	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
 
		
		PromptBox obj = new PromptBox();
		obj.alerts();
 
		
		driver.quit();
	}
 
	public void alerts() throws Throwable {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("test automation"); 
		Thread.sleep(4000);             
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
 
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("test automation dismiss");
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
	}
}
