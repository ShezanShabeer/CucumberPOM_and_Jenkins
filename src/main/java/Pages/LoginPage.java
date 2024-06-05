package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "Email")
    WebElement usernameWebEdit;

    @FindBy(id = "Password")
    WebElement passwordWebEdit;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement LoginButton;

    @FindBy(xpath = "//h1")
    WebElement Header_WebElement;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement LoginFail;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String user){
        usernameWebEdit.clear();
        usernameWebEdit.sendKeys(user);
    }

    public void enterPassword(String password){
        passwordWebEdit.clear();
        passwordWebEdit.sendKeys(password);
    }

    public void clickLogin(){
        LoginButton.click();
    }

    public boolean isHeaderDisplayed(){
        return Header_WebElement.isDisplayed();
    }

    public boolean isLoginFailDisplayed(){
        return LoginFail.isDisplayed();
    }
}
