package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//page URL = "https://anupdamoda.github.io/AceOnlineShoePortal/index.html"
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[type=\'checkbox\']")
    WebElement homePageMenu;
    @FindBy(xpath = "(//*[@id=\"ShoePortalTitle\"])[1]")
    WebElement homePageWebSiteText;
    @FindBy(xpath = "//li[contains(text(),'Home')]")
    WebElement homeMenu;
    @FindBy(xpath = "//li[contains(text(),'Sign In Portal')]")
    WebElement signInPortalMenu;
    @FindBy(xpath = "//li[contains(text(),'Online Products')]")
    WebElement onlineProductsMenu;
    @FindBy(xpath = "//li[contains(text(),'About')]")
    WebElement aboutPageMenu;
    @FindBy(xpath = "//li[contains(text(),'Our Team')]")
    WebElement ourTeamMenu;
    @(xpath = "//li[contains(text(),'Contact')]")
    WebElement contactMenu;

    public void clickOnMenu() {
        homePageMenu.click();
    }

    public void clickOnHomeMenu() {
        homeMenu.click();
    }

    public void clickOnSignInPortal() {
        signInPortalMenu.click();
    }

    public void clickOnOnlineProducts() {
        onlineProductsMenu.click();
    }

    public void clickOnAbout() {
        aboutPageMenu.click();
    }

    public void clickOnOurTeam() {
        ourTeamMenu.click();
    }

    public void clickOnContact() {
        contactMenu.click();
    }

    public void verifyTextOnHomePage() {
        String homePageWebsiteName = homePageWebSiteText.getText();
        Assert.assertEquals("Ace Online Shoe Portal", homePageWebsiteName);
    }
}