package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;


public class OrderPage extends AbstractComponent {
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	@FindBy(css = ".totalRow button")
	private WebElement checkoutEle;
	
	@FindBy(css = "tr td:nth-child(3)")
	 List<WebElement>productNames;

		 public boolean verifyOrderDisplay(String productName)
		{
				boolean match = productNames.stream().anyMatch((p -> p.getText().equalsIgnoreCase(productName)));
				return match;
		}

		 
}
		
	
