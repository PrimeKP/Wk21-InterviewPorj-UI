package com.virgin.steps;

import com.virgin.virgininfo.pages.TopMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    @Given("^I am on virgin game home page$")
    public void iAmOnVirginGameHomePage() {
    }

    @When("^I am clicking on Free Games$")
    public void iAmClickingOnFreeGames() {

        new TopMenuPage().clickOnAcceptCookies();
        new TopMenuPage().clickOnFreeGameTabOnTopMenu();
    }

    @Then("^I am on Free Game Page$")
    public void iAmOnFreeGamePage() {

    }

    @And("^I verify that I am on free game page \"([^\"]*)\"$")
    public void iVerifyThatIAmOnFreeGamePage(String expectedText) {

        Assert.assertEquals("Text is not verified", expectedText, new TopMenuPage().getPageTextandVerify());

    }

}
