package TestCases;

import Pages.HomePage;
import Pages.OnlineShoePortalProducts;
import Pages.SignInPortalPage;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.OnlineShoePortalProducts;

import static TestCases.SeleniumTest.*;


public class AddToCart {
    // Navigate to the carts page and add " - - - "  this product to the cart and capture the success message
    @Test()
    public void loginandgotoproductpage() throws InterruptedException {
        test = extent.createTest("Validate Product added to cart", "This test validates that the products can be added to cart");
        SeleniumTest.Setup();
        HomePage.click_signin_portal_menu_link();
        SignInPortalPage.enter_username_field();
        SignInPortalPage.enter_pwd_field();
        SignInPortalPage.click_on_Login_button_signUp_portal();
        OnlineShoePortalProducts.click_on_formal_shoes_product_link();
        OnlineShoePortalProducts.formalshoesproductpage();
        OnlineShoePortalProducts.validation_success_message_cartpage();
        extent.flush();
    }


}
