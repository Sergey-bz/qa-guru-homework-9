package com.github;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class StepsTest {

    private static final String REPOSITORY = "allure-framework/allure2";
    private static final String ISSUE = "Tooltip shows up too high";

    @Test
    public void searchIssueTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssuesTab();
        steps.issueWithNameShouldExist(ISSUE);
    }
}
