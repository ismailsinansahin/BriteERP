package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.DashboardPage;
import io.cucumber.java.en.Then;

import java.util.List;

public class UserModulesStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see related modules")
    public void the_user_should_be_able_to_see_related_modules(List<String> modules) {
        dashboardPage.verifyModuleNamesBasedOnUserTypes(modules);
    }

}
