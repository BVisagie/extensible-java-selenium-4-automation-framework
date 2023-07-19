package com.example.sut.wikipedia.pages;

import com.example.base.TestSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing {
    private final WebDriver driverInstance;

    private final By enWikipediaLink = By.id("js-link-box-en");

    public Landing(TestSession testSession) {
        this.driverInstance = testSession.getDriver();
    }

    public void navigateToEnglishLandingPage() {
        driverInstance.findElement(enWikipediaLink).click();
    }
}
