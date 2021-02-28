package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.BrowserUtils;
import com.smlsnnshn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreferencesPage {

    public PreferencesPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Change password')]")
    public WebElement changePasswordLink;

    @FindBy(xpath = "(//tbody/tr/td/input)[1]")
    public WebElement oldPasswordInputBox;

    @FindBy(xpath = "(//tbody/tr/td/input)[2]")
    public WebElement newPasswordInputBox;

    @FindBy(xpath = "(//tbody/tr/td/input)[3]")
    public WebElement confirmNewPasswordInputBox;

    @FindBy(xpath = "//button[contains(text(),'Change Password')]")
    public WebElement changePasswordSubmitButton;

    public void clickOnChangePasswordLink() {
        changePasswordLink.click();
    }

    public void enterOldPassword(String oldPassword) {
        BrowserUtils.waitFor(1);
        oldPasswordInputBox.sendKeys(oldPassword);
    }

    public void enterNewPassword(String newPassword) {
        newPasswordInputBox.sendKeys(newPassword);
    }

    public void enterNewPasswordAgain(String newPassword) {
        confirmNewPasswordInputBox.sendKeys(newPassword);
    }

    public void clickOnChangePasswordSubmitButton() {
        changePasswordSubmitButton.click();
    }

}
