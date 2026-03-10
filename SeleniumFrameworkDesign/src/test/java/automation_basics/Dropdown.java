package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Dropdown {

 
    // Constructor                         
    private WebDriver driver;

	@SuppressWarnings("static-access")    
    Dropdown(WebDriver driver) {         
        this.driver = driver;            
    }                                

 
    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Dropdown obj = new Dropdown(driver);
        obj.dropdwn();
        driver.quit();
    }
 
    public void dropdwn() throws Exception {
        Thread.sleep(4000);

        driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        Thread.sleep(4000);

        WebElement courseDropdown = driver.findElement(By.id("course")); 
        courseDropdown.click();

        Thread.sleep(4000);

        WebElement javaOption = driver.findElement(By.xpath("//select[@id='course']/option[@value='java']"));
        javaOption.click();

        Thread.sleep(4000);

        courseDropdown.click(); // Open the dropdown again
        WebElement dotNetOption = driver.findElement(By.xpath("//select[@id='course']/option[@value='net']"));
        dotNetOption.click();

        Thread.sleep(4000);
        courseDropdown.click(); // Open the dropdown again
        WebElement pythonOption = driver.findElement(By.xpath("//select[@id='course']/option[text()='Python']"));
        pythonOption.click();
        Thread.sleep(4000);
    }
}
 
 
 

	
