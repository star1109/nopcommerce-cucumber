package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String getWelcomeText() {
       log.info("Getting welcome text " + welcomeText.getText() + "<br>");
        String message = getTextFromElement(welcomeText);
        return message;
    }

    public void enterEmailId(String email) {
       log.info("Enter email " + email + " to email field " + emailField.getText() + "<br>");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
       log.info("Enter password " + password + " to password field " + passwordField.getText() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
       log.info("Clicking on Login Button "+loginButton.getText());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
       log.info("Getting error message : " + errorMessage.getText() + "<br>");
        String message = getTextFromElement(errorMessage);
        return message;
    }
}
