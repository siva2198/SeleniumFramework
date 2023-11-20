package TestCases;

import Pages.HomePage;
import Pages.SignInPortalPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static TestCases.SeleniumTest.*;

public class SignInPortal {
@Test
    void signinportal_validation_check() throws InterruptedException {
    SeleniumTest.Setup();
    test = extent.createTest("SignUp Portal Login","This test will check whether the user able to login");
    HomePage.click_signin_portal_menu_link();
    SignInPortalPage.enter_username_field();
    SignInPortalPage.enter_pwd_field();
    SignInPortalPage.click_on_Login_button_signUp_portal();
    extent.flush();



}

}
