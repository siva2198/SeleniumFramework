package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static TestCases.SeleniumTest.*;

public class OnlineShoePortalProducts {
    public static String formalshoeproductslinks_xpath = "/html/body/div[3]/div/div[1]/button";
    public static String sportsshoeproductlinks_xpath = "/html/body/div[3]/div/div[2]/button";
    public static String sneakersproductlinks_xpath = "/html/body/div[3]/div/div[3]/button";

    public static String prestigue_suede_product_xpath = "//*[contains(text(),'Prestigue Suede')]";
    public static String getPrestigue_suede_product_radio_button_xpath = "/html/body/div[2]/table/tbody/tr[4]/td[1]/input";
    public static String AddToCart_button_xpath = "/html/body/div[2]/table/tbody/tr[4]/td[6]/button";
    public static String AddToCartSucessfully_text_xpath = "/html/body/center[1]/h1";


    public static void click_on_formal_shoes_product_link() {
        driver.findElement(By.xpath(formalshoeproductslinks_xpath)).click();
    }

    public static void formalshoesproductpage() throws InterruptedException {
        Thread.sleep(2000);
        String productToBeAddInCart = "   Prestigue Suede";
        String actualtextin = driver.findElement(By.xpath(prestigue_suede_product_xpath)).getText();
        Assert.assertEquals(actualtextin, productToBeAddInCart);
        if (actualtextin.equals(productToBeAddInCart)) {
            driver.findElement(By.xpath(getPrestigue_suede_product_radio_button_xpath)).click();
            driver.findElement(By.xpath(AddToCart_button_xpath)).click();
            test.log(Status.PASS, "Prestigue shoe is added to cart successfully");
        } else {
            test.log(Status.FAIL, "Something went wrong");
        }
    }

    public static void validation_success_message_cartpage() throws InterruptedException {
        Thread.sleep(2000);
        String textInCartPage = driver.findElement(By.xpath(AddToCartSucessfully_text_xpath)).getText();
        String textInCartPageshouldbeDisplayed = "Added to Cart Successfully !!!";
        if (textInCartPageshouldbeDisplayed.equals(textInCartPage)) {
            test.log(Status.PASS, "Product added to cart sucessfully");
        } else {
            test.log(Status.FAIL, "Test case fail");
        }
    }
}
