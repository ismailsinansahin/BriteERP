package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(className = "oe_topbar_name")
    WebElement username;

    @FindBy(xpath = "//img[@class='img-circle oe_topbar_avatar']")
    WebElement avatar;

    @FindBy(xpath = "//*[@title='Conversations']")
    WebElement conversations;

    @FindBy(xpath = "//*[@title='Activities']")
    WebElement activities;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
    List<WebElement> moduleList;

    @FindBy(xpath = "//li[@id='menu_more_container']/ul/li")
    List<WebElement> moreModules;

    public void verifyUsernameIsCorrect(String expectedUsername){
        Assert.assertEquals(expectedUsername,username.getText());
    }

    public void verifyAvatarIsDisplayed(){
        Assert.assertTrue(avatar.isEnabled());
    }

    public void verifyConversationsIsDisplayed(){
        Assert.assertTrue(conversations.isEnabled());
    }

    public void verifyActivitiesIsDisplayed(){
        Assert.assertTrue(activities.isEnabled());
    }

    public void verifyModuleNamesBasedOnUserTypes(String userType){
        List<String> expectedModulesList = getExpectedModuleListBasedOnUserType(userType);
        System.out.println(expectedModulesList);
        List<String> actualModuleList = getActualModuleListFromUI();
        System.out.println(actualModuleList);
        Assert.assertEquals(expectedModulesList,actualModuleList);

    }

    private List<String> getActualModuleListFromUI() {

        System.out.println("moduleList.get(0).getText() = " + moduleList.get(0).toString());

        List<String> actualModulesList = new ArrayList();

        for (WebElement each: moduleList) {
            actualModulesList.add(each.getText());
        }

        System.out.println(actualModulesList);

        if (actualModulesList.contains("More")){
            actualModulesList.remove(actualModulesList.indexOf("More"));
            for (WebElement each: moreModules){
                actualModulesList.add(each.getText());
            }
        };

        System.out.println(actualModulesList.toString());

        return actualModulesList;

    }


    private List<String> getExpectedModuleListBasedOnUserType(String userType) {

        List<String> expectedModuleList = new ArrayList();

        String [] POSManagerExpectedModulesList = {"Discuss","Calendar","Notes","Contacts","CRM","Sales","Website",
                "Point of Sale","Purchases","Inventory","Manufacturing","Repairs","Project","Events","Surveys",
                "Employees","Attendances", "Leaves","Expenses","Maintenance","Fleet","Dashboards"};

        if (userType.startsWith("posmanager")){
            expectedModuleList.addAll(Arrays.asList(POSManagerExpectedModulesList));
        }

        return expectedModuleList;

    }

}
