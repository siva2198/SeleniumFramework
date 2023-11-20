package Pages;

import org.openqa.selenium.By;

import static TestCases.SeleniumTest.driver;

public class SignInPortalPage {
public static String Username_input_field_xpath ="/html/body/center[1]/div/form/div[1]/input";
public static String Pwd_input_field_xpath = "/html/body/center[1]/div/form/div[2]/input";
public static String Login_button_xpath ="/html/body/center[1]/div/form/input";

public static void enter_username_field(){
    driver.findElement(By.xpath(Username_input_field_xpath)).sendKeys("Siva");
}
public static void enter_pwd_field(){
    driver.findElement(By.xpath(Pwd_input_field_xpath)).sendKeys("Admin@123");
}
public static void click_on_Login_button_signUp_portal(){
    driver.findElement(By.xpath(Login_button_xpath)).click();
}
}
