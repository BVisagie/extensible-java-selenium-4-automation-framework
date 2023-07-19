package com.example.sut.wikipedia.tests;

import com.example.sut.wikipedia.pages.EnglishLanding;
import com.example.sut.wikipedia.pages.Landing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.example.base.Constants.SYSTEM_UNDER_TEST;
import static com.example.base.Constants.TEST_TYPE_COMPONENT;
import static org.assertj.core.api.Assertions.assertThat;

@Tag(SYSTEM_UNDER_TEST)
@Tag(TEST_TYPE_COMPONENT)
public class LandingPageTests extends TestsBase {

    @Test
    @DisplayName("The user should be able to navigate to the English Language landing page of Wikipedia.org successfully.")
    void navigateToEnWikipedia() {

        // Navigate to the base URL of the website under test
        testSession.getDriver().get(testSession.getUrlUnderTest());

        // Start a new instance of the page the URL navigates to and complete the first driver action
        new Landing(testSession).navigateToEnglishLandingPage();

        EnglishLanding englishLanding = new EnglishLanding(testSession);

        String enLandingPageTitle = englishLanding.getPageTitle();
        assertThat(enLandingPageTitle).isEqualTo("Wikipedia, the free encyclopedia");

        String enLandingPageUrl = englishLanding.getUrl();
        assertThat(enLandingPageUrl).isEqualTo("https://en.wikipedia.org/wiki/Main_Page");
    }

}
