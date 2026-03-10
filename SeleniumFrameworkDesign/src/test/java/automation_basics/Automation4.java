package automation_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation4 {


		public static void main(String[] args) throws InterruptedException {
			String expectedTitle = "Facebook"; 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.fb.com");
			String actualTitle = driver.getTitle(); 
			System.out.println("Expected==>" + expectedTitle);
			System.out.println("Actual==>" + actualTitle);
			if (actualTitle.contains(expectedTitle)) {  
				System.out.println("Title Validation Pass");
			} else {
				System.out.println("Title Validation Fail");
			}
		}
	
}
