package drivers;

import org.openqa.selenium.remote.BrowserType;

public class DriverManagerFactory{

    private static DriverManager driverManager;

    public static DriverManager getDriverManager(String type){


        if (BrowserType.FIREFOX.equals(type)) {
            driverManager = new FireFoxBrowserDriver();
        } else {
            driverManager = new ChromeBrowserDriver();
        }

        return driverManager;
    }
}