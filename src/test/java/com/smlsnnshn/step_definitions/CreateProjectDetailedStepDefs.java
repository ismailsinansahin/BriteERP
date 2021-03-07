package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.ProjectPage;
import io.cucumber.java.en.When;

public class CreateProjectDetailedStepDefs {

    ProjectPage projectPage = new ProjectPage();

    @When("select a customer from the customer dropdown {string}")
    public void select_a_customer_from_the_customer_dropdown(String customerName) {
        projectPage.selectACustomerFromCustomerDropdown(customerName);
    }

    @When("click on Emails tab")
    public void click_on_Emails_tab() {
        projectPage.clickOnEmailTab();
    }

    @When("enter an email alias {string}")
    public void enter_an_email_alias(String emailAlias) {
        projectPage.enterEmailAlias(emailAlias);
    }

}
