package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

import static stepDefinitions.Hooks.driver;


public class PurchaseProductsPage {

    public PurchaseProductsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='products']//div[1]//div[3]//button[1]")
    private WebElement Broccoli;
    public void clickBroccoli()
    {
        Broccoli.click();
    }

    @FindBy(xpath = "(//a[@href='#'][normalize-space()='+'])[3]")
    private WebElement ExtraCucumber;
    public void clickExtraCucumber()
    {
        ExtraCucumber.click();
    }

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='ADD TO CART'])[3]")
    private WebElement Cucumber;
    public void clickCucumber()
    {
        Cucumber.click();
    }

    @FindBy(xpath = "(//a[@href='#'][normalize-space()='+'])[6]")
    private WebElement ExtraTomato;
    public void clickExtraTomato()
    {
        ExtraTomato.click();
    }
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='ADD TO CART'])[6]")
    private WebElement Tomato;
    public void clickTomato()
    {
        Tomato.click();
    }
    @FindBy(css = "img[alt='Cart']")
    private WebElement Cart;
    public void clickCart()
    {
        Cart.click();
    }
    @FindBy(xpath = "//button[normalize-space()='PROCEED TO CHECKOUT']")
    private WebElement ProccedToCheckout;
    public void clickProceedToCheckout()
    {
        ProccedToCheckout.click();
    }

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > button:nth-child(14)")
    private WebElement PlaceOrder;
    public void clickPlaceOrder()
    {
        PlaceOrder.click();
    }
    @FindBy(xpath = "//*[@id='root']/div/div/div/div/div/select")
    private WebElement Country;
    public void selectAlgeriaFromCountry() {
        Select objSelect = new Select(Country);
        objSelect.selectByValue("Algeria");
    }
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement Termsandconditions;
    public void clickTermsandconditions()
    {
        Termsandconditions.click();
    }
    @FindBy(xpath = "//button[normalize-space()='Proceed']")
    private WebElement Proceed;
    public void clickProceed()
    {
        Proceed.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Thank you, your order has been placed successfully')]")
    private WebElement Successmessage;
    public boolean SuccessMessageIsDisplayed()
    {
        return Successmessage.isDisplayed();
    }
}
