package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
//import pageObjects.LoginPage;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://meditrack-stage-frontend.web.app/");
    }

    @Test
    public void loginTest() {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("jaya");
        login.enterPassword("Jaya@123");
        login.clickLogin();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

