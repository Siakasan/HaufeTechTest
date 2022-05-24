package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.InvalidPromoCodePage;

import static stepDefinitions.Hooks.driver;

public class InvalidPromoCodeSteps {

    public InvalidPromoCodePage invalidPromoCodePage;
    public InvalidPromoCodeSteps()
    {
        invalidPromoCodePage = new InvalidPromoCodePage(driver);
    }
    @And("I entered promo code {string}")
    public void iEnteredPromoCode(String code) {
        invalidPromoCodePage.enterPromocode(code);

    }

    @And("I click on apply button")
    public void iClickOnApplyButton() {
        invalidPromoCodePage.clickApply();
    }
}
