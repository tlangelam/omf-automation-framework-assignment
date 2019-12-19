package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalLoans{

    WebDriver driver;



    public PersonalLoans(WebDriver driver){
        this.driver = driver;
    }

    //Quick loan - AmountHold
    private By capitalValueBtn = By.xpath("//*[@id='calcAmountHold']/div/div[5]");
    // Quick loan - calcTermHold
    private By termValueBtn = By.xpath("//*[@id='calcTermHold']/div/div[9]");
    //Quick loan - calcTotalsHold
    private By totalPayMin = By.xpath("//*[@id=\"paymin\"]");
    private By totalPayMax = By.xpath("//*[@id=\"paymax\"]");
    // Quick loan pay-breakdown
    private By breakdownViewBtn = By.xpath("//*[@id=\"calcTotalsHold\"]/p[2]/a");
    private By breakdownCapital = By.xpath("//*[@id=\"breakdownCapital\"]");
    private By breakdownTerm = By.xpath("//*[@id=\"breakdownTerm\"]/p[2]/a");

    // page functionality
    public void clickCapitalAmountBtn(){
        driver.findElement(capitalValueBtn).click();
    }

    public void clickTermAmountBtn(){
        driver.findElement(termValueBtn).click();
    }

    public void clickBreakdownViewBtn(){
        driver.findElement(breakdownViewBtn).click();
    }
    // setters

    //getters
    public String getTotalPayMin(){
        return driver.findElement(totalPayMin).getText();
    }

    public String getTotalPayMax(){
        return driver.findElement(totalPayMax).getText();
    }

    public String getBreakdownCapital(){
        return driver.findElement(breakdownCapital).getText();
    }

    public String getBreakdownTerm(){
        return driver.findElement(breakdownTerm).getText();
    }
}