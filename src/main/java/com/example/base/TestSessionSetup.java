package com.example.base;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class TestSessionSetup {
    public static final String INCOGNITO = "--incognito";
    private boolean runHeadless;
    private boolean incognitoBrowser;

    public TestSession setupNewTestSession() {

        TestSessionConfiguration testSessionConfiguration = ConfigFactory.create(TestSessionConfiguration.class);

        runHeadless = testSessionConfiguration.runHeadless();
        incognitoBrowser = testSessionConfiguration.incognitoBrowser();

        // Convert the selected browser within the configuration file into an enum
        SupportedBrowsers selectedBrowser = Enum.valueOf(SupportedBrowsers.class, testSessionConfiguration.targetBrowser().toUpperCase());

        return TestSession
                .builder()
                .driver(configureWebDriver(selectedBrowser))
                .urlUnderTest(testSessionConfiguration.urlUnderTest())
                .build();
    }

    private WebDriver configureWebDriver(SupportedBrowsers selectedBrowser) {

        return
                switch (selectedBrowser) {
                    case EDGE -> setupEdgeWebdriver();
                    case CHROME -> setupChromeWebdriver();
                    case FIREFOX -> setupFireFoxWebdriver();
                    case SAFARI -> setupSafariWebdriver();
                };
    }

    private WebDriver setupEdgeWebdriver() {
        EdgeOptions options = new EdgeOptions();

        if (runHeadless) {
            options.addArguments("--headless=new");
        }

        if (incognitoBrowser) {
            options.addArguments(INCOGNITO);
        }

        return new EdgeDriver(options);
    }

    private WebDriver setupChromeWebdriver() {
        ChromeOptions options = new ChromeOptions();

        if (runHeadless) {
            options.addArguments("--headless=new");
        }

        if (incognitoBrowser) {
            options.addArguments(INCOGNITO);
        }

        return new ChromeDriver(options);
    }

    private WebDriver setupFireFoxWebdriver() {
        FirefoxOptions options = new FirefoxOptions();

        if (runHeadless) {
            options.addArguments("-headless");
        }

        if (incognitoBrowser) {
            options.addArguments(INCOGNITO);
        }

        return new FirefoxDriver(options);
    }

    private WebDriver setupSafariWebdriver() {
        SafariOptions options = new SafariOptions();
        return new SafariDriver(options);
    }
}
