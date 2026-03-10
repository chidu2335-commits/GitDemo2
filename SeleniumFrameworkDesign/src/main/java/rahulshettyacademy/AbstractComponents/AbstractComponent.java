package rahulshettyacademy.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.OrderPage;

public class AbstractComponent {
	/*
	public class CartPage  {

		public boolean verifyProductDisplay(String productName) {
			// TODO Auto-generated method stub
			return false;
		}
		public CartPage goToCartPage()
		{
		    cartHeader.click();
		    CartPage cartPage = new CartPage();
		    return cartPage;
		}
		public CheckoutPage goToCheckout() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	*/

	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartHeader;
	
	@FindBy(css = "[routerlink*='myorders']")
	WebElement orderHeaders;
	

	public void waitForElementToAppear(By findBy){
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToAppear(WebElement findBy){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	
	}
		public  AbstractComponent()
		{
			cartHeader.click();
			CartPage cartPage = new CartPage(driver);
			return;
		}
		public  OrderPage goToOrderPage()
		{
			cartHeader.click();
			OrderPage orderPage = new OrderPage(driver);
			return orderPage;
		}
	
	
		public void waitForElementToDisappear(WebElement ele) throws InterruptedException
		{
			Thread.sleep(1000);
			 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			//wait.until(ExpectedConditions.invisibilityOf(ele));
		}
	
}


