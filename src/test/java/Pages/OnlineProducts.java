package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// page_url = https://anupdamoda.github.io/AceOnlineShoePortal/OnlineProducts.html
public class OnlineProducts {
    WebDriver driver;
    public OnlineProducts(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(css = ".fa.fa-angle-double-down.formalshoedropdown")
    WebElement formalShoesDropDownButton;
    @FindBy(css = ".FormalShoesTitle")
    WebElement getFormalShoesDropDownText;
    @FindBy(css = ".fa.fa-angle-double-down.sportsshoedropdown")
    WebElement sportsShoeDropDownButton;
    @FindBy(css = ".SportsShoesTitle")
    WebElement getSportsShoeText;
    @FindBy(css = "i[class$='sneakershoedropdown']")
    WebElement sneakersShoeDropDownButton;
    @FindBy(css = ".SneakerShoesTitle")
    WebElement getSneakersShoeText;
    public void clickFormalShoeDropDown(){
        formalShoesDropDownButton.click();
    }
    public void clickSportsShoeDropDown(){
        sportsShoeDropDownButton.click();
    }
    public void clickSneakerShoeDropDown(){
        sneakersShoeDropDownButton.click();
    }
    public void verifyFormalShoeText(){
        String actualWebText=getFormalShoesDropDownText.getText();
        Assert.assertEquals(actualWebText,"Formal Shoes");
    }





}