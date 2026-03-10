package automation_basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(4000);

		ChromeDriver driver1 = (ChromeDriver) driver;

		File sourceFile = driver1.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\java\\Screenshot\\image1");

		FileUtils.copyFile(sourceFile, destinationFile);
		Thread.sleep(4000);

		driver.quit();
	}
}
