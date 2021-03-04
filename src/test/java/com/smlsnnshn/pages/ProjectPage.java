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

    @FindBy(className = "o_input_dropdown")
    public WebElement selectCustomerDropdownArrow;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[1]")
    public WebElement firstCustomerInTheDropdown;

    @FindBy(className = "o_pager_limit")
    public WebElement numberOfProjects;

    int existingNumberOfProjects;
    int newNumberOfProjects;
    int searchedProjectsOnTheDashboard;
    int searchedProjectAfterSearching;

    public void clickOnTheButton(String buttonName){
        String locator = "//button[contains(text(),'" + buttonName + "')]";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void getHowManyProjectExistWithTheNewProjectName(String projectName) {
        existingNumberOfProjects = getNumberOfProjectsWith(projectName);
    }

    public void getHowManyProjectExistWithTheProjectNameContains(String searchWord){
        searchedProjectsOnTheDashboard = getNumberOfProjectContains(searchWord);
    }

    public void enterProjectName(String projectName){
        BrowserUtils.waitForVisibility(projectNameInputBox,5);
        projectNameInputBox.sendKeys(projectName);
    }

    public void clickOnTheButtonOnTheCreateNewProjectPage(String buttonName) {
        if (buttonName.equals("Create")) createButtonOnTheCreateProjectPage.click();
        if (buttonName.equals("Create & Edit")) createAndEditButtonOnTheCreateProjectPage.click();
    }

    public void verifyThatTheNumberOfProjectsWithNewProjectNameIncreasedByOne(String projectName) {
        newNumberOfProjects = getNumberOfProjectsWith(projectName);
        Assert.assertEquals(1,newNumberOfProjects-existingNumberOfProjects);
    }

    public int getNumberOfProjectsWith(String projectName){
        int counter = 0;
        List<String> projectsList = getTheListOfProjectsOnTheDashboard();
        for (String eachProject : projectsList) {
            if (eachProject.equals(projectName)) counter++;
        }
        return counter;
    }

    private int getNumberOfProjectContains(String searchWord) {
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
        int numberOfTheProjectsOnTheDashboardPage = countTheProjects();
        int numberOfTheProjectsOnTheCounter = Integer.parseInt(numberOfProjects.getText());
        Assert.assertEquals(numberOfTheProjectsOnTheDashboardPage,numberOfTheProjectsOnTheCounter);
    }

    private int countTheProjects() {
        int counter = 0;
        for (WebElement eachProject : projectNamesListOnTheDashboard) counter++;
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
        BrowserUtils.waitFor(1);
        for (String eachProject : getTheListOfProjectsOnTheDashboard()){
            Assert.assertTrue(eachProject.toLowerCase().contains(searchWord.toLowerCase()));
        }
    }

    public void verifyAllProjectsContainsSearchWordAreDisplayed(String searchWord){
        searchedProjectAfterSearching = countTheProjects();
        Assert.assertEquals(searchedProjectsOnTheDashboard,searchedProjectAfterSearching);
    }

    public void selectACustomerFromCustomerDropdown(){

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        //use executeScript
        jse.executeScript("arguments[0].click;", selectCustomerDropdownArrow);
        BrowserUtils.waitFor(2);

    }

}
