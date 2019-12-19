import drivers.DriverManager;
import drivers.DriverManagerFactory;
import drivers.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestPersonalLoans {

    WebDriver driver;
    DriverManager driverManager;
    private  String hubURL = "http://0.0.0.0:4444/wd/hub";
    private String baseURL = "https://www.oldmutualfinance.co.za/personal-loans";

    @Test
    public void testLoanFor_Capital_ZAR50000_and_Term_84() throws MalformedURLException {
        //driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);

        driver.get(baseURL);

        Assert.assertEquals(driver.getTitle().toString(), "Personal loans | Online Loans | Debt Consolidation Loan");
    }

    @AfterTest
    public  void cleanup(){
        driver.close();
    }
}
