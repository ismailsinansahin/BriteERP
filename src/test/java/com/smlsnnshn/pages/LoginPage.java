package com.smlsnnshn.pages;

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

    public void loginAs(String userType){
        String username = userType + "Username";
        String password = userType + "Password";
        enterCredentials(username,password);
        clickOnLoginButton();
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
