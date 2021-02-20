package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("the user enter valid credentials {string} {string}")
    public void the_user_enter_valid_credentials(String username, String password) {
        loginPage.enterCredentials(username,password);
    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @When("the user login as a {string}")
    public void the_user_login_as_a(String userType) {
        loginPage.loginAsA(userType);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        loginPage.verifySuccessfulLogin();
    }

    @When("the user enter wrong credentials {string} {string}")
    public void the_user_enter_wrong_credentials(String username, String password) {
        loginPage.enterCredentials(username,password);
    }

    @When("the user enter blank credentials {string} {string}")
    public void the_user_enter_blank_credentials(String username, String password) {
        if (username.contains("blank")) username="";
        if (password.contains("blank")) password="";
        loginPage.enterCredentials(username,password);
    }

    @Then("the user should see wrong message {string}")
    public void the_user_should_see_wrong_message(String message) {
        loginPage.verifyWrongMessage(message);
    }

    @Then("the user should see blank message {string}")
    public void the_user_should_see_blank_message(String message) {
        loginPage.verifyBlankMessage(message);
    }

}
