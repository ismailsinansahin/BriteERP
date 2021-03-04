package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.ProjectPage;
import io.cucumber.java.en.When;

public class CreateProjectDetailedStepDefs {

    ProjectPage projectPage = new ProjectPage();

    @When("select a customer from the customer dropdown")
    public void select_a_customer_from_the_customer_dropdown() {
        projectPage.selectACustomerFromCustomerDropdown();
    }

    @When("click on Emails tab")
    public void click_on_Emails_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("enter an email alias {string}")
    public void enter_an_email_alias(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on the Dashboard link from the left menu")
    public void click_on_the_Dashboard_link_from_the_left_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
