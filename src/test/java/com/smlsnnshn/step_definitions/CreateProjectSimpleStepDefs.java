package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.ProjectPage;
import com.smlsnnshn.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateProjectSimpleStepDefs {

    ProjectPage projectPage = new ProjectPage();

    @When("get how many project exist with the new project name {string}")
    public void get_how_many_project_exist_with_the_new_project_name(String projectName) {
        projectPage.getHowManyProjectExistWithTheNewProjectName(projectName);
    }

    @When("click on the {string} button on the Dashboard page of the Project Module")
    public void click_on_the_button_on_the_Dashboard_page_of_the_Project_Module(String buttonName) {
        projectPage.clickOnTheButton(buttonName);
    }

    @When("enter a Project Name on the new page {string}")
    public void enter_a_Project_Name_on_the_new_page(String projectName) {
        projectPage.enterProjectName(projectName);
    }

    @When("click on the {string} button on the Create New Project page")
    public void click_on_the_button_on_the_Create_New_Project_page(String buttonName) {
        projectPage.clickOnTheButtonOnTheCreateNewProjectPage(buttonName);
        BrowserUtils.waitFor(1);
    }

    @Then("the user should see one additional project with the new project name {string}")
    public void the_user_should_see_one_additional_project_with_the_new_project_name(String projectName) {
        projectPage.verifyThatTheNumberOfProjectsWithNewProjectNameIncreasedByOne(projectName);
    }

}
