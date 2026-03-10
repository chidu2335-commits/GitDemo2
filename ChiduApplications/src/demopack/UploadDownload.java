package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UploadDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruitName =("Apple");
		String fileName ="/Users/chidanand/Downloads/download.xlsx";
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		//driver.manage().window().maximize();
		//Download
		driver.findElement(By.cssSelector("#downloadButton")).click();
		//upload
		
        WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
        upload.sendKeys("C:\\Users\\chidanand\\Downloads\\download.xlsx");

		
	//Edit excel- getColumnNumber of Price - update excel with row,col
        int col = getColumnNumber(fileName, "Price");
        int row = getRowNumber("Apple");
        updateCell(fileName,row,col,"599");
		
	
	//Wait for success message to shwo up and wait for disappear
		By toastlocator = By.cssSelector((".Toastify__toast-body div:nth-child(2"));		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null)); 
		String toastText = driver.findElement(toastlocator).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully,",toastText);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastlocator));
	//verify updated excel data showing in the web table
		String priceColumn = driver.findElement(By.xpath("//div[text()='price']")).getAttribute("data-column-id");
		String actualPrice= driver.findElement(By.xpath("//div[text()='"+toastText+"']/parent::div/div[@id='cell-4-undefined']")).getText();
		System.out.println(actualPrice);
		Assert.assertEquals("345", actualPrice);
		}

	private static void updateCell(String fileName, int row, int col, String string) {
		// TODO Auto-generated method stub
		
	}

	private static int getRowNumber(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getColumnNumber(String fileName, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getCoumnNumber(String fileName,String string) {
		return 0;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

