package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.PreferencesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ChangeAvatarStepDefs {

    PreferencesPage preferencesPage = new PreferencesPage();

    @And("change the avatar with new one {string}")
    public void change_the_avatar_with_new_one(String newImageName) {
        preferencesPage.changeTheAvatar(newImageName);
    }

    @And("take the screenshot of {string} avatar")
    public void take_the_screenshot_of_avatar(String avatar) throws IOException {
        preferencesPage.takeScreenshotOfAvatar(avatar);
    }

    @Then("verify the avatar has changed")
    public void verify_the_avatar_has_changed() throws IOException {
        preferencesPage.verifyTheAvatarHasChanged();
    }

}
