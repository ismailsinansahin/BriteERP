package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class UsernameStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see their {string} on the top menu")
    public void the_user_should_be_able_to_see_their_on_the_top_menu(String expectedUsername) {
        dashboardPage.verifyUsernameIsCorrect(expectedUsername);
    }

}
