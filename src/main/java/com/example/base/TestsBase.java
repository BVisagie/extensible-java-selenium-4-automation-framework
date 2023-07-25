package com.example.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * We must ensure that the tests are isolated from one another.
 * Create a new WebDriver instance per test. This helps ensure test isolation and makes parallelization simpler.
 * <a href="https://www.selenium.dev/documentation/test_practices/encouraged/avoid_sharing_state/">...</a>
 */
public class TestsBase {

    protected TestSession testSession;

    @BeforeEach
    public void setUp() {
        testSession = new TestSessionSetup().setupNewTestSession();
    }

    @AfterEach
    public void tearDown() {
        testSession.getDriver().quit();
    }
}
