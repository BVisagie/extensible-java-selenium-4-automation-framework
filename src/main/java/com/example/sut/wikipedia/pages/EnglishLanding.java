package com.example.sut.wikipedia.pages;

import com.example.base.TestSession;
import org.openqa.selenium.WebDriver;

public class EnglishLanding {
    private final WebDriver driverInstance;

    public EnglishLanding(TestSession testSession) {
        this.driverInstance = testSession.getDriver();
    }

    public String getPageTitle() {
        return driverInstance.getTitle();
    }

    public String getUrl() {
        return driverInstance.getCurrentUrl();
    }
}
