package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Dropdown2 {
 
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 
		Thread.sleep(4000);
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(4000);
 
		WebElement courseDropdown = driver.findElement(By.id("course"));  
		Select select = new Select(courseDropdown);   

 
		
		select.selectByValue("java"); 
		Thread.sleep(4000);
 
		select.selectByValue("net");  
		Thread.sleep(4000);
 
		
		select.selectByVisibleText("Python");  
		Thread.sleep(4000);  
	}
}

