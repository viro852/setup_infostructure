package com.rozdin;

import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected StartFrameworkManager startFrameworkManager = StartFrameworkManager.getInstance();

    @Step("Start the application")
    @BeforeEach
    public void setup() {
        startFrameworkManager.startFramework();
    }

    @Step("Stop the application")
    @AfterEach
    public void close() {
        startFrameworkManager.stopFramework();
    }
}
