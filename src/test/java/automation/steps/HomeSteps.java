package automation.steps;

import automation.pages.HomePage;
import automation.utils.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        homePage.verifyPage();
    }

    @When("user click on item {string}")
    public void userClickOnAnyItem(String itemName) {
        homePage.clickOnItem(itemName);
    }

    @When("user click on add to cart button for item {string}")
    public void user_click_on_add_to_cart_button_for_item(String itemName) {
        homePage.clickOnAddToCartForSpecificItem(itemName);
    }

    @Then("user see welcome message with their name")
    public void userSeeWelcomeMessageWithTheirName() {
        String name = PropertyReader.getProperty("signup.firstname");
        homePage.verifyWelcomeMessage(name);
    }

    @And("user see home button")
    public void userSeeHomeButton() {
    }

    @And("user see checking button")
    public void userSeeCheckingButton() {
    }

    @And("user see savings button")
    public void userSeeSavingsButton() {
    }

    @And("user see external button")
    public void userSeeExternalButton() {
    }
}
