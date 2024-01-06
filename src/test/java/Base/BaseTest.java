package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.Properties;

public class BaseTest {
    //Global declarations
    protected static WebDriver driver;
    public static Properties envConfig;
    //BROWSER as constant declaring
    private static final String BROWSER = System.setProperty("browser", "Chrome");

    @BeforeSuite
    public void suiteSetUp() {
        if (BROWSER.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void quit() {
        driver.quit();
    }

}
