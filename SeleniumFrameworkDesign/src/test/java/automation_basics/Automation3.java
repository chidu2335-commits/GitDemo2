package automation_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {

	public static void main(String[] args) throws InterruptedException {
		String expectedURL = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		System.out.println("Expected==>" + expectedURL);
		System.out.println("Actual==>" + actualURL);
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL Validation Pass");
		} else {
			System.out.println("URL Validation Fail");
		}
		driver.quit();
	}
}
