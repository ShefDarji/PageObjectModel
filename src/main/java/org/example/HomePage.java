package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _registerButton = By.className("ico-register");
    private By _logIn = By.className("ico-login");
    private By _electronics = By.xpath("//h2[@class='title']/a[@title=\"Show products in category Electronics\"]");
    private By _buildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']//div[2]/div[1]/div[1]/div[1]/a[@title='Show details for Build your own computer']");
    private By _searchButton = By.xpath("//button[@type='submit']");
    private By _voteButton = By.id("vote-poll-1");
    private By _nopCommNewReleaseButton = By.xpath("//div[@class='news-items']//div[2]//div[@class='buttons']");
    private By _currencyDropDown = By.name("customerCurrency");
    private By _clickOnFbButton = By.xpath("//a[.='Facebook']");
    private By _welcomeMsg = By.xpath("//h2[normalize-space()='Welcome to our store']");
    private By _searchInSearchBox = By.name("q");

    //method to click on Register button on homepage
    public void clickOnRegisterButton() {

        clickOnElement(_registerButton);
    }

    //click on Login Page
    public void clickOnLogIn() {

        clickOnElement(_logIn);
    }

    //Click on electronics page
    public void clickOnElectronics() {
        clickOnElement(_electronics);

    }

    //click on build your own computer on homepage
    public void clickOnBuildYourOwnComputer() {
        clickOnElement(_buildYourOwnComputer);
    }


    //method to search in search box
    public void typeInSearchBox() {

        typeText(_searchInSearchBox, loadProp.getProperty("searchProduct"));
    }


    //method to click on search button on home page
    public void clickOnSearchButton() {

        clickOnElement(_searchButton);
    }


    //method for search button alertMsg
    public void searchButtonAlert() {
        //comparing the alert msg
        String actualMsg = driver.switchTo().alert().getText();
        Assert.assertEquals(actualMsg, loadProp.getProperty("searchButtonExpMsg"), "Wrong pop up msg");

        //to accept the alert msg
        acceptAlertPopUp();
    }

    //method for vote button
    public void voteButton() {
        //click on vote button
        clickOnElement(_voteButton);
        sleepMethod(3000);
    }

    //method for vote alert msg
    public void voteAlert() {
        //comparing the alert msg
        String actualMsg = driver.switchTo().alert().getText();
        Assert.assertEquals(actualMsg, loadProp.getProperty("voteAlertExpectedMsg"), "Wrong pop up msg");

        //to accept the alert msg
        acceptAlertPopUp();
    }

    //method to find nopCommerceNewRelease Comments
    public void nopCommerceNewRelease() {
        //click on details under nopComm new release head
        clickOnElement(_nopCommNewReleaseButton);


    }

    public void currencySymbol() {

        //select the currency from dropdown by value
        selectByText(_currencyDropDown, loadProp.getProperty("currency"));

        List<WebElement> products = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        //if currency dollar products should be dollar as well
        for (WebElement element : products) {
            if (element.equals('$')) {
                System.out.println("products are in $");

            } else {
                System.out.println("products in €");

            }

        }
    }


    //method to click on FB
    public void clickOnFb() {
        //click on fb button
        clickOnElement(_clickOnFbButton);

    }

    //method to verify Home page Welcome msg
    public void welcomeMsg() {

        String actMsg = getText(_welcomeMsg);

        Assert.assertEquals(actMsg, loadProp.getProperty("expectedWelcomeMsg"), "No such msg found");
    }


    //method to click on camera
    public void cameraProduct() {

        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']"));

    }


}




