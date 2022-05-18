package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ComputerSteps {


    @Then("^Verify the 'computer' text$")
    public void verifyTheComputerText() {
        Assert.assertEquals("Not on computer page", "Computers", new ComputerPage().getPageTitleText());
    }

    @And("^I click on\"([^\"]*)\" tab$")
    public void iClickOnTab(String tab) {
        new HomePage().clickOnMenuTab("Computers");
    }

    @And("^I click on\"([^\"]*)\" sub tab$")
    public void iClickOnSubTab(String sub) {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("^Verify 'Desktops' text$")
    public void verifyDesktopsText() {
        Assert.assertEquals("Not on desktops page", "Desktops", new DesktopsPage().getPageTitleText());
    }

    @And("^Click on product name \"([^\"]*)\"$")
    public void clickOnProductName(String product) {
        new DesktopsPage().selectProduct("Build your own computer");
    }

    @And("^Select processor \"([^\"]*)\"$")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^Select RAM \"([^\"]*)\"$")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);

    }

    @And("^Select HDD \"([^\"]*)\"$")
    public void selectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^Select OS \"([^\"]*)\"$")
    public void selectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^Select Software \"([^\"]*)\"$")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^Click on 'ADD TO CART' Button$")
    public void clickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }


    @And("^Verify message 'The product has been added to your shopping cart'$")
    public void verifyMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals("product not added", "The product has been added to your shopping cart", new BuildYourOwnComputerPage().getProductAddedMessage());
    }
}
