package com.rozdin;

public class StartFrameworkManager {

    private static StartFrameworkManager startFrameworkManager;
    private static DriverManager driverManager = DriverManager.getInstance();


    private StartFrameworkManager() {

    }

    public static StartFrameworkManager getInstance() {
        if (startFrameworkManager == null) {
            startFrameworkManager = new StartFrameworkManager();
        }
        return startFrameworkManager;
    }

    public void startFramework(){
        driverManager.getDriver().get("https://www.aviasales.ru/");
    }


    public  void stopFramework(){
        driverManager.getDriver().quit();
    }

}
