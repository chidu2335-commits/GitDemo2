package automation_basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Pagesource {

	static WebDriver driver;            
 
	@SuppressWarnings("static-access")
 
	Pagesource(WebDriver driver) { 

		this.driver = driver;                       

	}                                                
 
 
	public static void main(String[] args) throws Throwable {
 
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize(); 

		Pagesource obj = new Pagesource(driver);

		obj.get_url_Title_Pagesource();

	}
 
	public void get_url_Title_Pagesource() throws Throwable {
 
		driver.navigate().to("https://www.selenium.dev/");
 
		

		String currenturl = driver.getCurrentUrl();
 
		

		String currenttitle = driver.getTitle();  

		System.out.println(currenttitle);
 
		

		String currentpagesource = driver.getPageSource();  

		System.out.println(currentpagesource);
 
		driver.manage().window().maximize();
 
		Thread.sleep(4000);
 
	}

}

 
