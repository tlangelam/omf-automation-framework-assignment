import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage {

    @Test
    public void testHomePage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.oldmutualfinance.co.za");

        Assert.assertEquals(driver.getTitle().toString(), "Home Page");
    }
}
