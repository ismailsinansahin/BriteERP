package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.ProjectPage;
import io.cucumber.java.en.Then;

public class NumberOfProjectsStepDefs {

    ProjectPage projectPage = new ProjectPage();

    @Then("the user should see the number of projects")
    public void the_user_should_see_the_number_of_projects() {
        projectPage.verifyTheNumberOfProjects();
    }

}
