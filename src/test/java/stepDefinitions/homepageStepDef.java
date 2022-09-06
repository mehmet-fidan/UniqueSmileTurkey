package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locators.HomePage;
import utils.Driver;
import utils.ParentClass;

public class homepageStepDef extends ParentClass {

    pages.HomePage homePage = new pages.HomePage();

    @Given("user is at home page")
    public void userIsAtHomePage() {
        driver.get(HomePage.url);
    }

    @When("user clicks to each function of menubar")
    public void userClicksToEachFunctionOfMenubar() {
        homePage.homePageTest();
    }

    @And("user close the driver")
    public void userCloseTheDriver() {
        homePage.quitDriver();
    }
}
