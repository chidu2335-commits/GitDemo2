package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;


public class CartPage extends AbstractComponent {
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	@FindBy(css = ".totalRow button")
	private WebElement checkoutEle;
	
	@FindBy(css = ".cartSection h3")
	 List<WebElement>cartProducts;

		 public boolean verifyProductDisplay(String productName)
		{
				boolean match = cartProducts.stream().anyMatch((p -> p.getText().equalsIgnoreCase(productName)));
				return match;
		}
		 public CheckoutPage goToCheckout() {
			    checkoutEle.click();     // ✅ correct
			    return new CheckoutPage(driver);
			}

		 
}
		 
		//public CheckoutPage goToCheckout() {
			//CheckoutPage.click();
			//return new CheckoutPage(driver);
		
	
