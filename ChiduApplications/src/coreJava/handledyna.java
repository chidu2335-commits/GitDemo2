package coreJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledyna {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(2000);
			List<WebElement>suggestions =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
				
			for (WebElement option :suggestions) {
				if(option.getText().contains("selenium webdriver"))
				{
					option.click();
					break;
				}
			}
	}

}
