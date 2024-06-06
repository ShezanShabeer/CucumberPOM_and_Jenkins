package Pages;

import WebdriverFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
    WebElement homePageLogo_WebElement;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//a[contains(@href,'/Admin/Product/List')]")
    WebElement ProductList;

    @FindBy(xpath = "//input[@id='SearchProductName']")
    WebElement SearchProductWebEdit;

    @FindBy(xpath = "//button[@id='search-products']")
    WebElement SearchProductButton;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
    WebElement catalog;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public boolean isHomePageDisplayed(){
        return homePageLogo_WebElement.isDisplayed();
    }

    public void clickLogout(){
        logoutButton.click();
    }

    public void clickProductList(){
        catalog.click();
        ProductList.click();
    }

    public void enterProduct(String productName){
        SearchProductWebEdit.sendKeys(productName);
    }

    public void clickSearch(){
        SearchProductButton.click();
    }

    public boolean isProductDisplayed(String product){
        String productName = DriverFactory.getDriver().findElement(By.xpath("//table[@id='products-grid']//tr[1]/td[3]")).getText();
        return productName.equals(product);
    }
}
