     import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
//70 to 75 vedios code in U DEMY.v      
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded ={"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
	}
		private static void addItems(WebDriver driver, String[] itemsNeeded) {
	// TODO Auto-generated method stub
	int j= 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product.name"));
		for (int i = 0;i<products.size();i++) {
			//Brocolli - 1 Kg
			//Brocolli, 	1 Kg
			
			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			//format it to get actual vegetable name 
			//check whether name you extracted is present in array or not
			//convert array into array list for easy search
			List itemsNeededList  = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on add cart
				driver.findElements(By.xpath("//div[@class='production']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}}}
		}
