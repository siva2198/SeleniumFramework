package TestCases;

import Pages.HomePage;
import Pages.ProductPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class SeleniumTest {
    public static WebDriver driver;
    static ExtentReports reports;
    public static ExtentTest test;
    public static ExtentReports extent = new ExtentReports();
    @BeforeSuite
    public static void Setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
    }
    @Test
    void validateTitles_online_products() throws InterruptedException {
        test = extent.createTest("Validate Titles on Online page", "This test validates that all the titles is present in the online product page");
        ProductPage.formalshoes_getTitle_validate();
        ProductPage.sportsshoes_getTitle_validate();
        ProductPage.sneakers_getTitle_validate();
        extent.flush();
    }
    @Test
    void validateFirstFormalShoe() throws InterruptedException {
        HomePage.click_online_product_link();
        test = extent.createTest("Validate First Formal Shoe Product title", "This test validates that all the titles is present in the formal shoe product");
        ProductPage.first_formalshoe_name_getTitle_validate();
    }
    @Test
    void validateFirstSportsShoe() throws InterruptedException {
        test = extent.createTest("Validate First Sports Shoe Product title", "This test validates that all the titles is present in the sports shoe product");
        ProductPage.first_sports_shoe_name_getTitle_validate();
    }
    @Test
    void validateFirstSneakerShoe() throws InterruptedException {
        test = extent.createTest("Validate First Sneaker Product title", "This test validates that all the titles is present in the sneakers product");
        ProductPage.first_sneakers_name_getTitle_validate();
    }
    @AfterSuite
    public static void cleanup() {
        extent.flush();
    }
}
