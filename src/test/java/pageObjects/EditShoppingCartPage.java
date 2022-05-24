package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditShoppingCartPage {
    public EditShoppingCartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='root']/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[3]/a")
    private WebElement Removetomato;
    public void clickRemovetomato()
    {
        Removetomato.click();
    }
    @FindBy(xpath = "//*[@id='root']/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[1]/a")
    private WebElement Removebroccoli;
    public void clickRemovebroccoli()
    {
        Removebroccoli.click();
    }

}
