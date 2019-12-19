package drivers;

import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowserDriver extends DriverManager{

    @Override
    public void createWebDriver(){
        this.driver = new ChromeDriver();
    }
}