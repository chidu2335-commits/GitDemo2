package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		Frames obj = new Frames();
		obj.handling_frames();

		driver.quit();
	}

	public void handling_frames() throws Throwable {
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(4000);

		driver.findElement(By.id("name")).sendKeys("text1");
		Thread.sleep(4000);

		WebElement frame1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame1);

		WebElement course = driver.findElement(By.id("course"));
		Select value = new Select(course);
		value.selectByIndex(1);
		Thread.sleep(4000);

		driver.switchTo().defaultContent();

		driver.findElement(By.id("name")).sendKeys("text2");
		Thread.sleep(4000);

		WebElement frame2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);

		WebElement basiccontrol = driver.findElement(By.id("selectnav1"));
		Select value2 = new Select(basiccontrol);
		value2.selectByIndex(1);
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
	}
}
