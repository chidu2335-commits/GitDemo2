package small;
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

	public class SubmitOrderTest {

	    public static void main(String[] args) {

	        String productName = "ZARA COAT 3";

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // 🌐 Launch Website
	        driver.get("https://rahulshettyacademy.com/client");

	        // 🔐 Login
	        driver.findElement(By.id("userEmail")).sendKeys("chidu2335@gmail.com");
	        driver.findElement(By.id("userPassword")).sendKeys("Chintu19#");
	        driver.findElement(By.id("login")).click();

	        // 🛒 Wait for products to load
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

	        // 📦 Get Product List
	        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

	        // ➕ Add Product to Cart
	        WebElement prod = products.stream()
	                .filter(product ->
	                        product.findElement(By.cssSelector("b")).getText().equals(productName))
	                .findFirst().orElse(null);

	        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

	        // ⏳ Wait for cart message
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));

	        // 🛒 Click Cart
	        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

	        // ✔ Verify Product in Cart
	        List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));

	        boolean match = cartProducts.stream()
	                .anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));

	        Assert.assertTrue(match);

	        // 💳 Checkout
	        driver.findElement(By.cssSelector(".totalRow button")).click();

	        // 🌍 Select Country
	        driver.findElement(By.cssSelector("[placeholder='Select Country']")).sendKeys("india");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

	        driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

	        // 📤 Submit Order
	        WebElement submit = driver.findElement(By.cssSelector(".action__submit"));

	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView(true);", submit);

	        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();

	        // ✅ Verify Confirmation Message
	        String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();

	        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	        System.out.println("Order Submitted Successfully");

	        driver.quit();
	    }
	}