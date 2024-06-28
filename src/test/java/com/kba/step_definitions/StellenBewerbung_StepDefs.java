package com.kba.step_definitions;

import com.kba.pages.*;
import com.kba.utilities.BrowserUtils;
import com.kba.utilities.ConfigReader;
import com.kba.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StellenBewerbung_StepDefs {

    HomePage homePage = new HomePage();
    KarrierePage karrierePage = new KarrierePage();
    StellenAngebotePage stellenAngebotePage = new StellenAngebotePage();
    BavBundStellenAngebotePage bavBundStellenAngebotePage = new BavBundStellenAngebotePage();
    EinstiegEBVPage einstiegEBVPage = new EinstiegEBVPage();
    KandidatenregistrierungPage kandidatenregistrierungPage = new KandidatenregistrierungPage();

    @Given("the user is on the KBA home page")
    public void the_user_is_on_the_kba_home_page() {
        Driver.getDriver().get(ConfigReader.get("url"));
    }

    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String menuName) {
        homePage.clickMenu(menuName);
    }

    @When("the user clicks on the {string} link on Karriere page")
    public void the_user_clicks_on_the_link_on_karriere_page(String itemName) {
        karrierePage.clickKarriereItem(itemName);

    }

    @When("the user clicks on a job listing containing {string}")
    public void the_user_clicks_on_a_job_listing_containing_under(String stelleKey) {
        stellenAngebotePage.clickStelle(stelleKey);

    }

    @When("the user clicks on the Jetzt bewerben button")
    public void the_user_clicks_on_the_Jetzt_bewerben_button() {
        bavBundStellenAngebotePage.clickBewerbenButton();
    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String ebvType) {
        einstiegEBVPage.clicksEbvTyp(ebvType);
    }

    @Then("the user verifies that they are on the {string} page")
    public void the_user_verifies_that_they_are_on_the_page(String expectedPageTitle) {
       kandidatenregistrierungPage.verifayPagetitle(expectedPageTitle);


    }
}
