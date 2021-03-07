package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.BrowserUtils;
import com.smlsnnshn.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProjectPage extends BasePage{

    @FindBy(xpath = "//input[@name='name']")
    public WebElement projectNameInputBox;

    @FindBy(xpath = "//button[@name='close_dialog']")
    public WebElement createButtonOnTheCreateProjectPage;

    @FindBy(xpath = "//button[@name='edit_dialog']")
    public WebElement createAndEditButtonOnTheCreateProjectPage;

    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public List<WebElement> projectNamesListOnTheDashboard;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//*[@title='Remove from Favorites']")
    public List<WebElement> favoriteProjectsList;

    @FindBy(xpath = "//*[@class='btn-group o_search_options']/div[1]")
    public WebElement filterDropdownButton;

    @FindBy(xpath = "//*[@title='Advanced Search...']")
    public WebElement advancedSearchButton;

    @FindBy(xpath = "//a[contains(text(),'My Favorites')]")
    public WebElement myFavoritesDropdownItem;

    @FindBy(className = "o_pager_limit")
    public WebElement numberOfProjects;

    @FindBy(className = "o_pager_value")
    public WebElement numberOfProjectsOnTheCurrentPage;

    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextPageArrow;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[4]")
    public WebElement customerDropdown;

    @FindBy(xpath = "//a[contains(text(),'Emails')]")
    public WebElement emailTab;

    @FindBy(xpath = "//input[@name='alias_name']")
    public WebElement emailAlias;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    int existingNumberOfProjects;
    int newNumberOfProjects;
    int searchedProjectsOnTheDashboard;
    int searchedProjectAfterSearching;
    int favoriteProjectsOnTheDashboard;
    int favoriteProjectsAfterSearching;

    public void clickOnTheButton(String buttonName){
        BrowserUtils.waitFor(3);
        String locator = "//button[contains(text(),'" + buttonName + "')]";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void getHowManyProjectExistWithTheNewProjectName(String projectName) {
        BrowserUtils.waitFor(1);
        existingNumberOfProjects = getNumberOfProjectsWith(projectName);
    }

    public void getHowManyProjectExistWithTheProjectNameContains(String searchWord){
        BrowserUtils.waitFor(1);
        searchedProjectsOnTheDashboard = getNumberOfProjectContains(searchWord);
    }

    public void enterProjectName(String projectName){
        BrowserUtils.waitForVisibility(projectNameInputBox,5);
        projectNameInputBox.sendKeys(projectName);
    }

    public void clickOnTheButtonOnTheCreateNewProjectPage(String buttonName) {
        BrowserUtils.waitFor(1);
        if (buttonName.equals("Create")) createButtonOnTheCreateProjectPage.click();
        if (buttonName.equals("Create & Edit")) createAndEditButtonOnTheCreateProjectPage.click();
    }

    public void verifyThatTheNumberOfProjectsWithNewProjectNameIncreasedByOne(String projectName) {
        BrowserUtils.waitFor(1);
        newNumberOfProjects = getNumberOfProjectsWith(projectName);
        Assert.assertEquals(1,newNumberOfProjects-existingNumberOfProjects);
    }

    public int getNumberOfProjectsWith(String projectName){
        BrowserUtils.waitFor(1);
        int counter = 0;
        List<String> projectsList = getTheListOfProjectsOnTheDashboard();
        for (String eachProject : projectsList) {
            if (eachProject.equals(projectName)) counter++;
        }
        return counter;
    }

    private int getNumberOfProjectContains(String searchWord) {
        BrowserUtils.waitFor(1);
        int counter = 0;
        List<String> projectsList = getTheListOfProjectsOnTheDashboard();
        for (String eachProject : projectsList) {
            if (eachProject.toLowerCase().contains(searchWord.toLowerCase())) counter++;
        }
        return counter;
    }

    public List<String> getTheListOfProjectsOnTheDashboard() {
        BrowserUtils.waitFor(1);
        List<String> projectNamesOnTheDashboard = new ArrayList<>();
        for (WebElement eachProject : projectNamesListOnTheDashboard){
            projectNamesOnTheDashboard.add(eachProject.getText());
        }
        return projectNamesOnTheDashboard;
    }

    public void verifyTheNumberOfProjects(){
        BrowserUtils.waitFor(1);
        int numberOfTheProjectsOnTheDashboardPage = countTheProjects();
        int numberOfTheProjectsOnTheCounter = Integer.parseInt(numberOfProjects.getText());
        Assert.assertEquals(numberOfTheProjectsOnTheDashboardPage,numberOfTheProjectsOnTheCounter);
    }

    private int countTheProjects() {
        BrowserUtils.waitFor(1);
        int counter = 0;
        int check80 = Integer.parseInt(numberOfProjectsOnTheCurrentPage.getText().split("-")[1]);
        if (check80==80) {
            counter=80;
            nextPageArrow.click();
            for (String eachProject : getTheListOfProjectsOnTheDashboard()) counter++;
        }else{
            for (String eachProject : getTheListOfProjectsOnTheDashboard()) counter++;
        }
        return counter;
    }

    public void enterTheSearchWordToTheSearchBox(String searchWord){
        BrowserUtils.waitFor(1);
        searchInputBox.sendKeys(searchWord);
    }

    public void enterEnterKey(){
        BrowserUtils.waitFor(1);
        searchInputBox.sendKeys(Keys.ENTER);
    }

    public void verifyAllProjectsDisplayedOnTheDashboardContains(String searchWord){
        BrowserUtils.waitFor(3);
        for (String eachProject : getTheListOfProjectsOnTheDashboard()){
            Assert.assertTrue(eachProject.toLowerCase().contains(searchWord.toLowerCase()));
        }
    }

    public void verifyAllProjectsContainsSearchWordAreDisplayed(String searchWord){
        BrowserUtils.waitFor(3);
        searchedProjectAfterSearching  = countTheProjects();
        Assert.assertEquals(searchedProjectsOnTheDashboard,searchedProjectAfterSearching);
    }

    public void getHowManyFavoriteProjectExistsOnTheDashboard(){
        BrowserUtils.waitFor(2);
        favoriteProjectsOnTheDashboard = countFavoriteProjects();
    }

    public void clickOnAdvancedSearchButton(){
        BrowserUtils.waitFor(3);
        advancedSearchButton.click();
    }

    public void clickOnFiltersDropdown(){
        BrowserUtils.waitFor(3);
        filterDropdownButton.click();
    }

    public void clickOnMyFavoritesUnderFilters(){
        BrowserUtils.waitFor(3);
        myFavoritesDropdownItem.click();
    }

    public void verifyAllFavoriteProjectsAreShown(){
        BrowserUtils.waitFor(1);
        favoriteProjectsAfterSearching  = countTheProjects();
        Assert.assertEquals(favoriteProjectsOnTheDashboard,favoriteProjectsAfterSearching);
    }

    public void verifyAllProjectsDisplayedOnTheDashboardAreFavoriteProjects(){
        BrowserUtils.waitFor(1);
        for (WebElement eachProject : favoriteProjectsList){
            Assert.assertTrue(eachProject.getAttribute("title").contains("Remove"));
        }
    }

    public int countFavoriteProjects(){
        BrowserUtils.waitFor(1);
        int counter = 0;
        for (WebElement eachProject : favoriteProjectsList) counter++;
        return counter;
    }

    public void selectACustomerFromCustomerDropdown(String customerName){
        BrowserUtils.waitFor(1);
        customerDropdown.click();
        BrowserUtils.waitFor(1);
        String locator =  "//a[contains(text(),'" + customerName + "')]";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void clickOnEmailTab(){
        BrowserUtils.waitFor(1);
        emailTab.click();
    }

    public void enterEmailAlias(String email){
        BrowserUtils.waitFor(1);
        emailAlias.sendKeys(email);
    }

    public void clickOnSaveButton(){
        BrowserUtils.waitFor(1);
        saveButton.click();
    }

}
