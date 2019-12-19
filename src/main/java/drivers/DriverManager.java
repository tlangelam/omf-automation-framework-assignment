package drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager{

    protected WebDriver driver;

    protected abstract void createWebDriver();

    public void quitWebDriver(){
        driver.quit();
        driver = null;
    }

    public WebDriver getWebDriver() {

        return driver;
    }
}