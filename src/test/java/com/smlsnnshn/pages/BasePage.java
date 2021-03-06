package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.BrowserUtils;
import com.smlsnnshn.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(className = "oe_topbar_name")
    public WebElement username;

    @FindBy(xpath = "//h1[contains(text(),'Odoo User Documentation')]")
    public WebElement documentationPageLocator;

    @FindBy(xpath = "//h1[contains(text(),'Odoo Pricing')]")
    public WebElement supportPageLocator;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement preferencesPageLocator;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement myOdooComAccountPageLocator;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    public WebElement loginPageLocator;

    @FindBy(xpath = "//a[@class='dropdown-toggle']/img")
    public WebElement avatarImage;

    @FindBy(xpath = "//*[@title='Conversations']")
    public WebElement conversations;

    @FindBy(xpath = "//*[@title='Activities']")
    public WebElement activities;

    @FindBy(xpath = "//li[@id='menu_more_container']/a")
    public WebElement moreButton;

    @FindBy(xpath = "//li[contains(text(),'#Inbox')]")
    public WebElement discussPageLocator;

    @FindBy(className = "o_calendar_view")
    public WebElement calendarPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Notes')]")
    public WebElement notesPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Contacts')]")
    public WebElement contactsPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Pipeline')]")
    public WebElement CRMPagesLocator;

    @FindBy(xpath = "//li[contains(text(),'Quotations')]")
    public WebElement salesPageLocator;

    @FindBy(xpath = "//button[contains(text(),'Last Week')]")
    public WebElement webSiteSamePageLocator;

    @FindBy(xpath = "//a[contains(text(),'Best solution for startups')]")
    public WebElement webSiteNewPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Point of Sale')]")
    public WebElement pointOfSalePageLocator;

    @FindBy(xpath = "//li[contains(text(),'Requests for Quotation')]")
    public WebElement purchasesPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Inventory')]")
    public WebElement inventoryPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Manufacturing Orders')]")
    public WebElement manufacturingPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Repair Orders')]")
    public WebElement repairsPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Projects')]")
    public WebElement projectPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Events')]")
    public WebElement eventsPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Surveys')]")
    public WebElement surveysPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Employees')]")
    public WebElement employeesPageLocator;

    @FindBy(xpath = "//div[contains(text(),'Manage Attendances')]")
    public WebElement attendancesPageLocator;

    @FindBy(xpath = "//div[contains(text(),'My Leaves')]")
    public WebElement leavesPageLocator;

    @FindBy(xpath = "//li[contains(text(),'My Expenses to Submit')]")
    public WebElement expensesPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Maintenance Teams')]")
    public WebElement maintenancePageLocator;

    @FindBy(xpath = "//li[contains(text(),'Vehicles')]")
    public WebElement fleetPageLocator;

    @FindBy(xpath = "//span[contains(text(),'My Dashboard')]")
    public WebElement dashboardsPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Customer Invoices')]")
    public WebElement invoicingPageLocator;

    @FindBy(xpath = "//li[contains(text(),'My Timesheets')]")
    public WebElement timesheetsPageLocator;

    @FindBy(xpath = "//div[contains(text(),'My Lunch')]")
    public WebElement lunchPageLocator;

    @FindBy(xpath = "//li[contains(text(),'Mass Mailings')]")
    public WebElement emailMarketingPageLocator;

    @FindBy(xpath = "//span[contains(text(),'Ok')]")
    public WebElement lunchWindowOKButton;

    public void verifyUsernameIsCorrect(String expectedUsername){
        Assert.assertEquals(expectedUsername,username.getText());
    }

    public void verifyAvatarIsDisplayed(){
        BrowserUtils.waitFor(1);
        Assert.assertTrue(avatarImage.isEnabled());
    }

    public void verifyConversationsIsDisplayed(){
        BrowserUtils.waitFor(1);
        Assert.assertTrue(conversations.isDisplayed());
    }

    public void verifyActivitiesIsDisplayed(){
        BrowserUtils.waitFor(1);
        Assert.assertTrue(activities.isDisplayed());
    }

    public void verifyModuleNamesBasedOnUserTypes(List<String> modulesList){
        BrowserUtils.waitFor(1);
        clickOnTheMoreButton();
        for (String each : getExpectedModuleList(modulesList)){
            String moduleNameLocator = "//span[contains(text(),'" + each + "')]";
            Assert.assertTrue(Driver.get().findElement(By.xpath(moduleNameLocator)).isDisplayed());
        }
    }

    public void verifyModuleLinksBasedOnUserTypes(String userType, List<String> modulesList){
        BrowserUtils.waitFor(1);
        for (String each : getExpectedModuleList(modulesList)) {
            clickOnTheModuleLink(each);
            if (each.equals("Website")) {
                if (userType.startsWith("POS") || userType.startsWith("Sales")) {
                    Assert.assertTrue(webSiteSamePageLocator.isDisplayed());
                } else {
                    Assert.assertTrue(webSiteNewPageLocator.isDisplayed());
                    Driver.get().navigate().back();
                }
            }else{
                Assert.assertTrue(getLocatorsOfPages(each).isDisplayed());
                verifyYouAreOnDashboardPage(each);
            }
        }
    }

    public List<String> getExpectedModuleList(List<String> modulesList) {
        BrowserUtils.waitFor(1);
        List<String> expectedModuleList = new ArrayList<>();
        for (String each : modulesList) {
            if (!each.equals("-")) expectedModuleList.add(each);
        }
        return expectedModuleList;
    }

    public void clickOnTheMoreButton() {
        BrowserUtils.waitFor(1);
        try {
            if (moreButton.isEnabled()) moreButton.click();
        }catch (ElementNotInteractableException e){
            e.printStackTrace();
        }
    }

    public void verifyYouAreOnDashboardPage(String moduleLink) {
        BrowserUtils.waitFor(1);
        if (moduleLink.equals("Lunch")) lunchWindowOKButton.click();
        BrowserUtils.waitFor(1);
    }

    public void clickOnTheModuleLink(String moduleLink) {
        BrowserUtils.waitFor(3);
        String moduleLinkLocator = "//span[contains(text(),'" + moduleLink + "')]";
        WebElement moduleName = Driver.get().findElement(By.xpath(moduleLinkLocator));
        try {
            moduleName.click();
            BrowserUtils.waitFor(1);
        }catch (ElementNotInteractableException e){
            moreButton.click();
            BrowserUtils.waitFor(1);
            moduleName.click();
        }
    }

    public WebElement getLocatorsOfPages(String moduleName) {
        BrowserUtils.waitFor(1);
        Map<String, WebElement> locatorsOfLinks= new HashMap<String, WebElement>() {{
            put("Discuss", discussPageLocator);
            put("Calendar", calendarPageLocator);
            put("Notes", notesPageLocator);
            put("Contacts", contactsPageLocator);
            put("CRM", CRMPagesLocator);
            put("Sales", salesPageLocator);
            put("Website", webSiteNewPageLocator);
            put("Point of Sale", pointOfSalePageLocator);
            put("Purchases", purchasesPageLocator);
            put("Inventory", inventoryPageLocator);
            put("Manufacturing", manufacturingPageLocator);
            put("Repairs", repairsPageLocator);
            put("Project", projectPageLocator);
            put("Events", eventsPageLocator);
            put("Surveys", surveysPageLocator);
            put("Employees", employeesPageLocator);
            put("Attendances", attendancesPageLocator);
            put("Leaves", leavesPageLocator);
            put("Expenses", expensesPageLocator);
            put("Maintenance", maintenancePageLocator);
            put("Fleet", fleetPageLocator);
            put("Dashboards", dashboardsPageLocator);
            put("Invoicing", invoicingPageLocator);
            put("Timesheets", timesheetsPageLocator);
            put("Lunch", lunchPageLocator);
            put("Email Marketing", emailMarketingPageLocator);
        }};
        return locatorsOfLinks.get(moduleName);
    }

    public void clickOnTheUsername(){
        BrowserUtils.waitFor(3);
        username.click();
    }

    public void clickOnTheDropdownItem(String dropdownItem){
        BrowserUtils.waitFor(1);
        String locator = "//a[contains(text(),'" + dropdownItem + "')]";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void verifyYouAreOnTheRelatedPage(String dropdownItem){
        BrowserUtils.waitFor(1);
        if (dropdownItem.contains("Documentation")) {
            swtichToTheNewPage();
            Assert.assertTrue(documentationPageLocator.isDisplayed());
        }
        if (dropdownItem.contains("Support")) {
            swtichToTheNewPage();
            Assert.assertTrue(supportPageLocator.isDisplayed());
        }
        if (dropdownItem.contains("Preferences")) {
            Assert.assertTrue(preferencesPageLocator.isDisplayed());
            preferencesPageLocator.click();
        }
        if (dropdownItem.contains("My Odoo.com account")) {
            Assert.assertTrue(myOdooComAccountPageLocator.isDisplayed());
            Driver.get().navigate().back();
        }
        if (dropdownItem.contains("Log out")) {
            Assert.assertTrue(loginPageLocator.isDisplayed());
        }
    }

    public void swtichToTheNewPage(){
        BrowserUtils.waitFor(1);
        String currentWindowHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String each : windowHandles) {
            if (!each.equals(currentWindowHandle)) {
                Driver.get().switchTo().window(each);
            }
        }
    }

}