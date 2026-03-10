package automation_basics;

	import org.openqa.selenium.By;   

	import org.openqa.selenium.WebDriver; 

	import org.openqa.selenium.chrome.ChromeDriver;  
	 
	public class Locator {

		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();   

			driver.get("https://www.saucedemo.com/v1/");

			driver.findElement(By.id("user-name")).sendKeys("Manual ");    

			driver.findElement(By.className("form_input")).sendKeys("Testing ");

			driver.findElement(By.name("user-name")).sendKeys("Automation ");

			driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing  ");

			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing  ");

			driver.findElement(By.tagName("input")).sendKeys("Testing  ");
	

	}

}
