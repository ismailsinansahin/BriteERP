package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.ConfigurationReader;
import com.smlsnnshn.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "login")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    public WebElement loginButton;

    @FindBy(className = "alert")
    public WebElement wrongMessage;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement blankMessage;

    public void enterCredentials(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void loginAsA(String userType){
        String username, password;
        if (userType.startsWith("POS Manager")) {
            username = ConfigurationReader.get("posManagerUsername");
            password = ConfigurationReader.get("posManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Sales Manager")) {
            username = ConfigurationReader.get("salesManagerUsername");
            password = ConfigurationReader.get("salesManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Expenses Manager")){
            username = ConfigurationReader.get("expensesManagerUsername");
            password = ConfigurationReader.get("expensesManagerPassword");
            enterCredentials(username,password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Inventory Manager")) {
            username = ConfigurationReader.get("inventoryManagerUsername");
            password = ConfigurationReader.get("inventoryManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Manufacturing User")) {
            username = ConfigurationReader.get("manufacturerUserUsername");
            password = ConfigurationReader.get("manufacturerUserPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
    }

    public void verifySuccessfulLogin(){
        String loginPageTitle = Driver.get().getTitle();
        Assert.assertEquals("Odoo",loginPageTitle);
    }

    public void verifyWrongMessage(String expectedMessage){ Assert.assertEquals(expectedMessage,wrongMessage.getText()); }

    public void verifyBlankMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage,blankMessage);
    }

}
