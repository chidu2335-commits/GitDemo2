package automation_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

public class Pageload {

	static WebDriver driver; // webDriver declaration -->driver is a WebDriver reference ,
								// static allows it to be shared across methods without creating multiple
								// objects

	@SuppressWarnings("static-access")
	Pageload(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Pageload obj = new Pageload(driver);
		obj.pageload_timeout();
	}

	public void pageload_timeout() throws Throwable {

		Instant startTime = Instant.now();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");

		Instant endTime = Instant.now();
		System.out.println(driver.getTitle());

		Duration duration = Duration.between(startTime, endTime);
		System.out.println(
				startTime.toString() + "\n" + endTime.toString() + "\n" + duration.toMillis() + " milliseconds");
	}
}
