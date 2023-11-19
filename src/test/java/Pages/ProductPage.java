package Pages;

import com.aventstack.extentreports.Status;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.testng.Assert;

import static TestCases.SeleniumTest.*;

import static TestCases.SeleniumTest.driver;

public class ProductPage {
    public static String formalshoes_text_xpath = "/html/body/div[2]/center/h2";
    public static String sportsshoes_text_xpath = "/html/body/div[3]/center/h2";
    public static String sneakers_text_xpath = "/html/body/div[4]/center/h2";
    public static String formalshoes_dropdown_xpath = "/html/body/div[2]/center/div/i[1]";
    public static String sportsshoes_dropdown_xpath = "/html/body/div[3]/center/div/i[1]";
    public static String sneaker_dropdown_xpath = "/html/body/div[4]/center/div/i[1]";
    public static String formalshoes_tbody_first_shoename = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String getSportsshoes_tbody_first_shoename = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String getsneakers_tbody_first_shoename = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formalshoes_getTitle_validate() {
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalshoes_text_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);
    }

    public static void sportsshoes_getTitle_validate() {
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportsshoes_text_xpath)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);

    }

    public static void sneakers_getTitle_validate() {
        String expectedTitleS = "Sneakers";
        String actualTitleS = driver.findElement(By.xpath(sneakers_text_xpath)).getText();
        Assert.assertEquals(expectedTitleS, actualTitleS);

    }

    public static void first_formalshoe_name_getTitle_validate() {
        driver.findElement(By.xpath(formalshoes_dropdown_xpath)).click();
        String expectedFirstFormalShoeName = "   Classic Cheltenham";
        String actualFirstFormalShoeName = driver.findElement(By.xpath(formalshoes_tbody_first_shoename)).getText();
        Assert.assertEquals(expectedFirstFormalShoeName, actualFirstFormalShoeName);
        if (expectedFirstFormalShoeName.equals(actualFirstFormalShoeName)) {
            test.log(Status.PASS, "Test case passes for title verification");
        } else {
            test.log(Status.FAIL, "Test case failed for title verification");
        }


    }

    public static void first_sports_shoe_name_getTitle_validate() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(sportsshoes_dropdown_xpath)).click();
        String expectedFirstSportsShowName = "   Ultimate";
        String actualFirstSportsShoeName = driver.findElement(By.xpath(getSportsshoes_tbody_first_shoename)).getText();
        Assert.assertEquals(expectedFirstSportsShowName, actualFirstSportsShoeName);
        if (expectedFirstSportsShowName.equals(actualFirstSportsShoeName)) {
            test.log(Status.PASS, "Test case passes for title verification");
        } else {
            test.log(Status.FAIL, "Test case failed for title verification");
        }
    }

    public static void first_sneakers_name_getTitle_validate() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(sneaker_dropdown_xpath)).click();
        String expectedFirstSneakerName = "  Archivo";
        String actualFirstSneakerName = driver.findElement(By.xpath(getsneakers_tbody_first_shoename)).getText();
//      Assert.assertEquals(expectedFirstSneakerName,actualFirstSneakerName);
//        if(expectedFirstSneakerName.equals(actualFirstSneakerName)){
//            test.log(Status.PASS,"Test case passes for title verification");
//        }
//        else{
//            test.log(Status.FAIL,"Test case failed for title verification");
//        }
        try {
            Assert.assertEquals(expectedFirstSneakerName, actualFirstSneakerName);
            test.log(Status.PASS, "Test case passes for title verification");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Test case failed for title verification: " + e.getMessage());
        }
    }
}
