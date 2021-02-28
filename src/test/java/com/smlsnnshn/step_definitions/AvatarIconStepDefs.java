package com.smlsnnshn.step_definitions;

import com.smlsnnshn.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class AvatarIconStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see their avatars on the top menu")
    public void the_user_should_be_able_to_see_their_avatars_on_the_top_menu() {
        dashboardPage.verifyAvatarIsDisplayed();
    }

}
