package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.ProjectPage;
import com.smlsnnshn.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProjectsWithProjectNameStepDefs {

    ProjectPage projectPage = new ProjectPage();

    @When("get how many project exist with the project name contains search word {string}")
    public void get_how_many_project_exist_with_the_project_name_contains_search_word(String searchWord) {
        projectPage.getHowManyProjectExistWithTheProjectNameContains(searchWord);
    }

    @When("enter the search word to the searchbox {string}")
    public void enter_the_search_word_to_the_searchbox(String searchWord) {
        projectPage.enterTheSearchWordToTheSearchBox(searchWord);
    }

    @When("enter Enter key")
    public void enter_Enter_key() {
        projectPage.enterEnterKey();
    }

    @Then("verify all projects displayed on the dashboard contains search word {string}")
    public void verify_all_projects_displayed_on_the_dashboard_contains_search_word(String searchWord) {
        projectPage.verifyAllProjectsDisplayedOnTheDashboardContains(searchWord);
    }

    @Then("verify all projects contains search word are displayed {string}")
    public void verify_all_projects_contains_search_word_are_displayed(String searchWord) {
        projectPage.verifyAllProjectsContainsSearchWordAreDisplayed(searchWord);
    }

}
