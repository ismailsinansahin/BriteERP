package com.smlsnnshn.pages;

import com.smlsnnshn.utilities.BrowserUtils;
import com.smlsnnshn.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PreferencesPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Change password')]")
    public WebElement changePasswordLink;

    @FindBy(xpath = "(//tbody/tr/td/input)[1]")
    public WebElement oldPasswordInputBox;

    @FindBy(xpath = "(//tbody/tr/td/input)[2]")
    public WebElement newPasswordInputBox;

    @FindBy(xpath = "(//tbody/tr/td/input)[3]")
    public WebElement confirmNewPasswordInputBox;

    @FindBy(xpath = "//button[contains(text(),'Change Password')]")
    public WebElement changePasswordSubmitButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "(//input[@type='file'])[3]")
    public WebElement editButtonOnTheAvatar;

    public void clickOnChangePasswordLink() {
        changePasswordLink.click();
    }

    public void enterOldPassword(String oldPassword) {
        BrowserUtils.waitFor(1);
        oldPasswordInputBox.sendKeys(oldPassword);
    }

    public void enterNewPassword(String newPassword) {
        newPasswordInputBox.sendKeys(newPassword);
    }

    public void enterNewPasswordAgain(String newPassword) {
        confirmNewPasswordInputBox.sendKeys(newPassword);
    }

    public void clickOnChangePasswordSubmitButton() {
        changePasswordSubmitButton.click();
    }

    public void changeTheAvatar(String newImageName) {
        String newImagePath = "C:\\Users\\A\\IdeaProjects\\BriteERP\\src\\test\\resources\\images\\" + newImageName + ".jpg";
        BrowserUtils.waitFor(1);
        editButtonOnTheAvatar.sendKeys(newImagePath);
        BrowserUtils.waitFor(1);
        saveButton.click();
    }

    public void takeScreenshotOfAvatar(String avatar) throws IOException {
        BrowserUtils.waitFor(5);
        Screenshot screenshot = new AShot().takeScreenshot(Driver.get(),avatarImage);
        String path = "C:\\Users\\A\\IdeaProjects\\BriteERP\\src\\test\\resources\\images\\" + avatar + ".png";
        File file = new File(path);
        if (!file.canWrite()) file.setWritable(true);
        if (!file.canRead()) file.setReadable(true);
        ImageIO.write(screenshot.getImage(),"PNG", file);
    }

    public void verifyTheAvatarHasChanged() throws IOException {
        String oldImagePath = "C:\\Users\\A\\IdeaProjects\\BriteERP\\src\\test\\resources\\images\\old.png";
        String newImagePath = "C:\\Users\\A\\IdeaProjects\\BriteERP\\src\\test\\resources\\images\\new.png";
        BufferedImage oldImage = ImageIO.read(new File(oldImagePath));
        BufferedImage newImage = ImageIO.read(new File(newImagePath));
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(oldImage, newImage);
        Assert.assertTrue(diff.hasDiff());
    }

}
