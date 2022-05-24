package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.PurchaseProductsPage;
import static stepDefinitions.Hooks.driver;


import java.util.concurrent.TimeUnit;

public class PurchaseProductsSteps {

    public PurchaseProductsPage purchaseProductsPage;


    public PurchaseProductsSteps()
    {
        purchaseProductsPage = new PurchaseProductsPage(driver);
    }

    @Given("I navigates to the website")
    public void i_navigates_to_the_website()
    {
          driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("I click on add to cart broccoli")
    public void i_click_on_add_to_cart_broccoli()
    {
        purchaseProductsPage.clickBroccoli();
    }

    @And("I click on plus button to add extra cucumber")
    public void iClickOnPlusButtonToAddExtraCucumber()
    {
        purchaseProductsPage.clickExtraCucumber();
    }

    @And("I click on add to cart cucumber")
    public void iClickOnAddToCartCucumber()
    {
        purchaseProductsPage.clickCucumber();
    }

    @And("I click on plus button to add extra tomato")
    public void iClickOnPlusButtonToAddExtraTomato()
    {
        purchaseProductsPage.clickExtraTomato();
    }

    @And("I click on add to cart tomatoes")
    public void iClickOnAddToCartTomatoes()
    {
        purchaseProductsPage.clickTomato();
    }

    @And("I click on cart button")
    public void iClickOnCartButton()
    {
        purchaseProductsPage.clickCart();
    }

    @And("I click on proceed to checkout")
    public void iClickOnProceedToCheckout()
    {
        purchaseProductsPage.clickProceedToCheckout();
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        purchaseProductsPage.clickPlaceOrder();
    }

    @And("I select country")
    public void iSelectCountry()
    {
        purchaseProductsPage.selectAlgeriaFromCountry();
    }

    @And("I tick on agree to term and conditions")
    public void iTickOnAgreeToTermAndConditions()
    {
        purchaseProductsPage.clickTermsandconditions();
    }

    @And("I click on proceed button")
    public void iClickOnProceedButton()
    {
        purchaseProductsPage.clickProceed();
    }

    @Then("A success message is displayed")
    public void aSuccessMessageIsDisplayed() {
        Assert.assertTrue(purchaseProductsPage.SuccessMessageIsDisplayed());

    }
}
