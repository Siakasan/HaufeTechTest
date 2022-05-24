package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidPromoCodePage {
    public InvalidPromoCodePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter promo code']")
    private WebElement Promocode;
    public void enterPromocode(String code)
    {
        Promocode.sendKeys(code);
    }
    @FindBy(xpath = "//button[normalize-space()='Apply']")
    private WebElement Apply;
    public void clickApply()
    {
        Apply.click();
    }
}
