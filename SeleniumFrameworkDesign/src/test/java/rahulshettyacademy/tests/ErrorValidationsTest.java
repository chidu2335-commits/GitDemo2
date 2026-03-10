package rahulshettyacademy.tests;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import rahulshettyacademy.TestComponets.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

@SuppressWarnings("unused")
public class ErrorValidationsTest extends BaseTest{

	//public static void main(String[] args) throws InterruptedException {
	
		//148 to 156 vedios complete framework design and Maven project
		@Test(groups= {"ErrorHandling"})
		public void LoginErrorValidation() throws InterruptedException {
			
		String productName = "ZARA COAT 3";
		landingPage.loginApplication("chidu2335@gmail.com", "Chitu19#");
		Assert.assertEquals("incorrect email or password, ", landingPage.getErrorMessage());
		}
		
		@Test
		public void ProductErrorValidation() throws InterruptedException {
			
		String productName = "ZARA COAT 3";
		//LandingPage landingPage = launchinApplications();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		LandingPage landingPage1 = new LandingPage(driver);
		landingPage1.goTo();
		ProductCatalogue productCatalogue =landingPage1.loginApplication("chidu2335@gmail.com", "Chintu19#");

		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		
		boolean match = cartPage.verifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		}
}
 