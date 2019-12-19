package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //web element locators
    private By pageTitle = By.id("pagetitle");
    private By personalLoanBtn = By.xpath("//div[@id='infopans']/div/div/div[4]/a");

    // homepage functionality
    public void clickPersonalLoans(){
        driver.findElement(personalLoanBtn).click();
    }

    // setters

    //getters
    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }
}