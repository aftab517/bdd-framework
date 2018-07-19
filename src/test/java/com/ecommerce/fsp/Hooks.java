package com.ecommerce.fsp;

import com.ecommerce.fsp.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private DriverFactory driverFactory = new DriverFactory();
    private String url = System.getProperty("url");

    @Before
    public void setUp() {
        driverFactory.openBrowser();
        driverFactory.navigateTo(url);
        driverFactory.applyImpWait();
        driverFactory.maxBroser();
    }

    @After
    public void tearDown() {
        driverFactory.closeBrowser();
    }
}
