package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.DashboardPage;
import com.smlsnnshn.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ModuleLinksStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the {string} should be able to go related modules")
    public void the_should_be_able_to_go_related_modules(String userType, List<String> modules) {
        BrowserUtils.waitFor(1);
        dashboardPage.verifyModuleLinksBasedOnUserTypes(userType, modules);
    }

    @When("go to {string} module")
    public void go_to_module(String moduleName) {
        BrowserUtils.waitFor(1);
        dashboardPage.clickOnTheModuleLink(moduleName);
    }

}
