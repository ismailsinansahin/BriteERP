package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.ProjectPage;
import com.smlsnnshn.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProjectsWithFavoritesStepDefs {

    ProjectPage projectPage = new ProjectPage();

    @When("get how many favorite project exists on the Dashboard")
    public void get_how_many_favorite_project_exists_on_the_Dashboard() {
        BrowserUtils.waitFor(1);
        projectPage.getHowManyFavoriteProjectExistsOnTheDashboard();
    }

    @When("click on Advanced Search button")
    public void click_on_Advanced_Search_button() {
        projectPage.clickOnAdvancedSearchButton();
    }

    @When("click on Filters dropdown")
    public void click_on_Filters_dropdown() {
        projectPage.clickOnFiltersDropdown();
    }

    @When("click on My Favorites")
    public void click_on_My_Favorites() {
        projectPage.clickOnMyFavoritesUnderFilters();
    }

    @Then("verify all projects displayed on the dashboard are favorite projects")
    public void verify_all_projects_displayed_on_the_dashboard_are_favorite_projects() {
        BrowserUtils.waitFor(1);
        projectPage.verifyAllProjectsDisplayedOnTheDashboardAreFavoriteProjects();
    }

    @Then("verify all favorite projects are shown")
    public void verify_all_favorite_projects_are_shown() {
        BrowserUtils.waitFor(1);
        projectPage.verifyAllFavoriteProjectsAreShown();
    }

}
