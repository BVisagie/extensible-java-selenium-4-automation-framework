package com.example.base;

import org.aeonbits.owner.Config;

/**
 * Why?
 * The class `TestSessionConfiguration` is the connection between the property file `test_session.properties` located within the resources package.
 * The `@Config.Sources` load the properties file and match the attributes with the `@Key`, so you automatically have the value.
 * You can see two sources.
 * The first one will get the property values from the system (as environment variables or from the command line) in the case you want to change it, for example, in a pipeline.
 * The second will load the `test_session.properties` file from the classpath.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:test_session.properties"})
public interface TestSessionConfiguration extends Config {
    @Config.Key("url.under.test")
    String urlUnderTest();

    @Config.Key("target.browser")
    String targetBrowser();

    @Config.Key("run.headless")
    boolean runHeadless();

    @Config.Key("incognito.browser")
    boolean incognitoBrowser();
}

