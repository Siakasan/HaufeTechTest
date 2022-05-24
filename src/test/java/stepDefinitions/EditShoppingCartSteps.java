package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.EditShoppingCartPage;

import static stepDefinitions.Hooks.driver;

public class EditShoppingCartSteps {

    public EditShoppingCartPage editShoppingCartPage;
    public EditShoppingCartSteps()
    {
        editShoppingCartPage = new EditShoppingCartPage(driver);
    }

    @And("I click on remove button to remove tomato")
    public void iClickOnRemoveButtonToRemoveTomato() {
        editShoppingCartPage.clickRemovetomato();
    }
    @And("I click on remove button to remove broccoli")
    public void iClickOnRemoveButtonToRemoveBroccoli() {
        editShoppingCartPage.clickRemovebroccoli();

    }

}
