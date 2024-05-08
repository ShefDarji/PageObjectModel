
package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {

    //creating obj to call browser from TestData
    LoadProp loadProp = new LoadProp();

    //method to start browser and type url
    String browser = (loadProp.getProperty("browser"));

    public void openBrowser() {
        //if chrome it will enter this loop
        if (browser.equalsIgnoreCase("Chrome")) {

            driver = new ChromeDriver();
            System.out.println("Your browser is Chrome");

        }  //if firefox it will enter this loop
        else if (browser.equalsIgnoreCase("Firefox")) {

            driver = new FirefoxDriver();
            System.out.println("Browser is Firefox");

        }//if edge it will enter this loop
        else if (browser.equalsIgnoreCase("Edge")) {

            driver = new EdgeDriver();
            System.out.println("Browser is Edge");

        }//if safari it will enter this loop
        else if (browser.equalsIgnoreCase("Safari")) {

            driver = new SafariDriver();
            System.out.println("Browser is Safari");

        }//if none of the above it will enter this loop i.e any other browser
        else {
            System.out.println("Your browser is " + browser);
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }


    //method to close the windows
    public void closeBrowser() {

        driver.quit();
    }

}
