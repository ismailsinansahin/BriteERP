package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class UserModulesStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see related modules based on {string}")
    public void the_user_should_be_able_to_see_related_modules_based_on(String userType) {
        dashboardPage.verifyModuleNamesBasedOnUserTypes(userType);
    }

}
