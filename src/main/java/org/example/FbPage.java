package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Set;


public class FbPage extends Utils {
    private By _closeLogin = By.xpath("//div[@aria-label='Close']//i[@class='x1b0d499 x1d69dk1']");
    private By _nopComOnFbPage = By.xpath("//h1[@class='html-h1 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1vvkbs x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']");
    LoadProp loadProp = new LoadProp();


    public void fbPage() {
        //cookies method from utils
        cookiesInNewWindow();
        //accept the cookies
        clickOnElement(By.xpath("//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']"));
        //click on close option for login
        clickOnElement(_closeLogin);
    }

    //method to check nopComm name
    public void verifyNopCommOnFbPage() {
        //verify nopCom is there on fb page
        String actName = getText(_nopComOnFbPage);
        //to verify nopComm is there on the Fb page
        Assert.assertEquals(actName, loadProp.getProperty("fbPageNobCommExp"), "Not found");
    }

    //method to check url should have fb word
    public void checkUrl() {
        //method to get current page url
        String url = driver.getCurrentUrl();
        //assert method to check my exp url MATCHES current url
        Assert.assertTrue(loadProp.getProperty("expectedUrl").matches(url), "Not correct url");

    }

    //method to switch back to main home page
    public void switchToMainPage() {
        //keep that tab open and come back to home page
        cookiesInNewWindow();
    }
}












