package com.ecommerce.fsp.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private String browser = "chrome";
    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void applyImpWait(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }


    public void navigateTo(String url){
        driver.get(url);
        System.out.println("navigating to "+url);
    }

    public void maxBroser(){
        driver.manage().window().maximize();
    }
}
