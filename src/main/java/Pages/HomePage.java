package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
    WebElement homePageLogo_WebElement;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public boolean isHomePageDisplayed(){
        return homePageLogo_WebElement.isDisplayed();
    }

    public void clickLogout(){
        logoutButton.click();
    }
}
