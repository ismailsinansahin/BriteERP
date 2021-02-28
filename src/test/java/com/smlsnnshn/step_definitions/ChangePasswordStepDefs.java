package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.LoginPage;
import com.smlsnnshn.pages.PreferencesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ChangePasswordStepDefs {

    PreferencesPage preferencesPage = new PreferencesPage();
    LoginPage loginPage = new LoginPage();

    @And("click on the Change Password button")
    public void clickOnTheChangePasswordButton() {
        System.out.println("change password link: " + preferencesPage.changePasswordLink.isDisplayed());
        preferencesPage.clickOnChangePasswordLink();
    }

    @And("enter Old Password {string}")
    public void enter_Old_Password(String oldPassword) {
        System.out.println("old password input box: " + preferencesPage.oldPasswordInputBox.isDisplayed());
        preferencesPage.enterOldPassword(oldPassword);
    }

    @And("enter New Password {string}")
    public void enter_New_Password(String newPassword) {
        preferencesPage.enterNewPassword(newPassword);
    }

    @And("enter New Password again {string}")
    public void enterNewPasswordAgain(String newPassword) {
        preferencesPage.enterNewPasswordAgain(newPassword);
    }

    @And("click on Change Password button")
    public void click_on_Change_Password_button() {
        preferencesPage.clickOnChangePasswordSubmitButton();
    }

    @Then("the user sould be in the Login Page")
    public void the_user_sould_be_in_the_Login_Page() {
        loginPage.loginButton.isDisplayed();
    }

}
