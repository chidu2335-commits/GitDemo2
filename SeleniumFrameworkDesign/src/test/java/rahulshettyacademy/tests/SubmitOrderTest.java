package rahulshettyacademy.tests;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import rahulshettyacademy.TestComponets.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.OrderPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

@SuppressWarnings("unused")
public class SubmitOrderTest extends BaseTest{
	String productName = "ZARA COAT 3";
	//public static void main(String[] args) throws InterruptedException {
	
		//148 to 156 vedios complete framework design and Maven project
		
		@Test(dataProvider="getData",groups= {"Purchase"})
		public void SubmitOrder(HashMap<String,String>input) throws InterruptedException {
			
	
		LandingPage landingPage = launchinApplications();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		LandingPage landingPage1 = new LandingPage(driver);
		landingPage1.goTo();
		ProductCatalogue productCatalogue =landingPage1.loginApplication(input.get("email"),input.get("password"));

		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(input.get("product"));
		CartPage cartPage = productCatalogue.goToCartPage();
		
		boolean match = cartPage.verifyProductDisplay("product");
		System.out.println(match);
		Assert.assertTrue(match);
		
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("India");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
		
	}
		@Test(dependsOnMethods= {"SubmitOrder"})
		public void orderHistoryTest() 
		{
			//"ZARA COAT 3";
			ProductCatalogue productCatalogue =landingPage.loginApplication("chidu2335@gmail.com", "Chintu19#");
			OrderPage orderPage = productCatalogue.goToOrderPage();
			Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
		
		}
		
		@DataProvider
		public Object[][] getData()
		{
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("email", "chidu2335gmail.com");
			map.put("password", "Chintu19#");
			map.put("product", "ZARA COAT 3");
			

			HashMap<String,String> map1 = new HashMap<String,String>();
			map1.put("email", "puttumantur@gmail.com");
			map1.put("password", "Chintu19#");
			map1.put("product", "ADIDAS ORIGINAL");
			
			
			
			
			return new Object[][] {{map},{map1} };
		}

		// To verify ZARA COAT displaying in the orders page
	private LandingPage launchinApplications() {
		// TODO Auto-generated method stub
		return null;
	}
}
 