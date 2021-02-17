package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
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
    public WebElement username;

    @FindBy(xpath = "//img[@class='img-circle oe_topbar_avatar']")
    public WebElement avatar;

    @FindBy(xpath = "//*[@title='Conversations']")
    public WebElement conversations;

    @FindBy(xpath = "//*[@title='Activities']")
    public WebElement activities;

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
        for (String each : expectedModulesList) Assert.assertTrue(verifyModuleName(each));
    }

    private boolean verifyModuleName(String moduleName) {
        String modluleLinkLocator = "//span[contains(text(),'" + moduleName + "')]";
        WebElement moduleLink = Driver.get().findElement(By.xpath(modluleLinkLocator));
        System.out.println(moduleName + " is enabled: " + moduleLink.isEnabled());
        return moduleLink.isEnabled();
    }


    private List<String> getExpectedModuleListBasedOnUserType(String userType) {

        List<String> expectedModuleList = new ArrayList();

        String [] POSManagerExpectedModulesList = {"Discuss", "Calendar", "Notes", "Contacts", "CRM", "Sales", "Website",
                "Point of Sale", "Purchases", "Inventory", "Manufacturing", "Repairs", "Project", "Events", "Surveys",
                "Employees", "Attendances", "Leaves", "Expenses", "Maintenance", "Fleet", "Dashboards"};
        String [] expensesManagerExpectedModulesList = {"Discuss", "Calendar", "Notes", "Contacts", "Website",
                "Events", "Employees", "Leaves", "Expenses", "Lunch", "Maintenance", "Dashboards"};
        String [] salesManagerExpectedModulesList = {"Discuss","Calendar","Notes","Contacts","CRM","Sales","Website",
                "Point of Sale","Purchases","Inventory","Repairs","Invoicing","Email Marketing", "Events", "Employees",
                "Leaves","Expenses","Maintenance","Dashboards"};
        String [] manufacturingUserExpectedModulesList = {"Discuss","Calendar","Notes","Contacts", "Website",
                "Manufacturing", "Events","Employees", "Leaves","Expenses", "Maintenance","Dashboards"};
        String [] inventoryManagerExpectedModulesList = {"Discuss", "Calendar", "Notes", "Contacts", "Website",
                "Inventory", "Manufacturing", "Repairs", "Invoicing", "Timesheets", "Employees", "Leaves", "Expenses",
                "Lunch", "Maintenance", "Dashboards"};


        if (userType.startsWith("posmanager")){
            expectedModuleList.addAll(Arrays.asList(POSManagerExpectedModulesList));
        }
        if (userType.startsWith("expensesmanager")){
            expectedModuleList.addAll(Arrays.asList(expensesManagerExpectedModulesList));
        }
        if (userType.startsWith("salesmanager")){
            expectedModuleList.addAll(Arrays.asList(salesManagerExpectedModulesList));
        }
        if (userType.startsWith("immmanager")){
            expectedModuleList.addAll(Arrays.asList(inventoryManagerExpectedModulesList));
        }
        if (userType.startsWith("manuf_user")){
            expectedModuleList.addAll(Arrays.asList(manufacturingUserExpectedModulesList));
        }

        return expectedModuleList;

    }

}
