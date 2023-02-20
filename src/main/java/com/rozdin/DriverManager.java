package com.rozdin;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static DriverManager driverManager;
    private WebDriver driver;

    private DriverManager() {

    }

    public static DriverManager getInstance() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }

    public WebDriver getDriver() {
        if(driver==null){
            setup();
        }
        return driver;
    }

    private void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.setCapability("enableVNC", true);
        String url = "http://127.0.0.1:4441/wd/hub";
        try {
            driver = new RemoteWebDriver(new URL(url), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().setSize(new Dimension(1920, 1024));
    }
}
