package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.DashboardPage;
import io.cucumber.java.en.Then;

import java.util.List;

public class ModuleLinksStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the {string} should be able to go related modules")
    public void the_should_be_able_to_go_related_modules(String userType, List<String> modules) {
        System.out.println(userType + "test is running");
        dashboardPage.verifyModuleLinksBasedOnUserTypes(userType, modules);
    }

}
