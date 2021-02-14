package com.smlsnnshn.step_definitions;

import com.smlsnnshn.utilities.BrowserUtils;
import com.smlsnnshn.utilities.ConfigurationReader;
import com.smlsnnshn.utilities.DBUtils;
import com.smlsnnshn.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb(){
        System.out.println("\tconnecting to Database...");
        DBUtils.createConnection();

    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tdisconnecting from Database...");
        DBUtils.destroy();
    }

}
