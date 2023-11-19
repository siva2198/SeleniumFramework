package Pages;

import org.openqa.selenium.By;

import static TestCases.SeleniumTest.driver;

public class HomePage {
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String online_product_link_xpath = "/html/body/div/nav/div/ul/a[3]"; // /html/body/div/nav/div/ul/a[3]/li

    public static void click_hamburger_menu() {
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_online_product_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(online_product_link_xpath)).click();
    }
}
