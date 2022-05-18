package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails() {

    }



    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstName){
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastName){
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I enter email \"([^\"]*)\" for register$")
    public void iEnterEmailForRegister(String email){
        new RegisterPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"for register$")
    public void iEnterPasswordForRegister(String password){
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"for register$")
    public void iEnterConfirmPasswordForRegister(String confirmPassword){
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }


    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String gender)  {
       new RegisterPage().selectGender(gender);
    }

    @And("^I select \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" of DOB$")
    public void iSelectOfDOB(String day, String month, String year) {
        new RegisterPage().selectDateOfBirth(day, month, year);
    }


    @Then("^Verify registration successful$")
    public void verifyRegistrationSuccessful() {
        String actual =new RegisterPage().getYourRegCompletedText();
        String expected = "Your registration completed";
        Assert.assertEquals("Registration not successful",expected,actual);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^Verify the register text$")
    public void verifyTheRegisterText() {
        String actual =new RegisterPage().getRegisterText();
        String expected ="Register";
        Assert.assertEquals("not on register page",expected,actual);
    }

    @Then("^Verify the all error messages of field \"([^\"]*)\"as \"([^\"]*)\"$")
    public void verifyTheAllErrorMessagesOfFieldAs(String fieldName, String errorMessage) {
    Assert.assertEquals("Error message not displayed",errorMessage,new RegisterPage().getValidationErrorMessageForField(fieldName));

    }
}
