import drivers.DriverManager;
import drivers.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.PersonalLoans;

import java.net.MalformedURLException;
import java.net.URL;

public class TestPersonalLoans {

    WebDriver driver;
    DriverManager driverManager;
    PersonalLoans page;
    //private  String hubURL = "http://0.0.0.0:4444/wd/hub";
    //private String baseURL = "https://www.oldmutualfinance.co.za/personal-loans";

    @Test
    @Parameters({"hubUrl", "baseUrl", "browser"})
    public void testLoanFor_Capital_ZAR50000_and_Term_84(String hubURL, String baseURL, String browser ) throws MalformedURLException {
        //driverManager = DriverManagerFactory.getDriverManager(BrowserType.CHROME);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if(browser.equals("FIREFOX") )
            capabilities.setBrowserName(BrowserType.FIREFOX);
        else
            capabilities.setBrowserName(BrowserType.CHROME);

        driver = new RemoteWebDriver(new URL(hubURL), capabilities);

        driver.get(baseURL);

        page = new PersonalLoans(driver);

        //Under the CALCULATOR click R50 000 then click 84 MONTHS
        page.clickCapitalAmountBtn();
        page.clickTermAmountBtn();

        //validate the amounts R1,463.04 and R1,642.59.
        Assert.assertEquals(page.getTotalPayMin(), "R1,463.04");
        Assert.assertEquals(page.getTotalPayMax(), "R1,642.59");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click View Breakdown link and validate that the correct CAPITAL and TERM values are displayed.
        page.clickBreakdownViewBtn();
        Assert.assertEquals(page.getBreakdownCapital(), "R1,463.04");
        Assert.assertEquals(page.getBreakdownTerm(), "R1,642.59");

    }

    @AfterTest
    public  void cleanup(){
        driver.close();
    }
}
