package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebSitePage {

    public WebSitePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[contains(text(),'Best solution for startups')]")
    WebElement websitePageLocator;

}
