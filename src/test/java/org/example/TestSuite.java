
package org.example;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LogInPage logInPage = new LogInPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    CameraCartPage cameraCartPage = new CameraCartPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    BuildYourOwnComputerCartPage buildYourOwnComputerCartPage = new BuildYourOwnComputerCartPage();
    NopCommNewReleasePage nopCommNewReleasePage = new NopCommNewReleasePage();
    FbPage fbPage = new FbPage();
    SearchedProductPage searchedProductPage = new SearchedProductPage();


    @Test
    public void verifyUserShouldSuccessfullyRegister() {
        //click on register on homepage
        homePage.clickOnRegisterButton();
        //fill details on registration page
        registerPage.fillRegistrationDetails();
        //check registration is done correctly or not
        registerResultPage.registrationDone();
    }

    @Test
    public void verifyRegisteredUserShouldLoginAndReferAFriend() {
        //click on register on homepage
        homePage.clickOnRegisterButton();
        //fill details on registration page
        registerPage.fillRegistrationDetails();
        //check registration is done correctly or not
        registerResultPage.registrationDone();
        //once registered User should log in from homepage
        //homePage.clickOnLogIn();
        //enter login details on login page
        // logInPage.logIn();
        //click on electronics on homepage
        homePage.clickOnElectronics();
        //click on camera category
        electronicsPage.clickOnCameraCategory();
        //click on the product to refer from camera page
        cameraAndPhotoPage.clickOnCameraProduct();
        //Add the product in cart
        cameraCartPage.referAFriend();
        //send email to friend
        emailFriendPage.enterFriendDetails();

    }

    @Test
    public void toVerifyUserShouldAddMakeYourOwnComputer() {
        //click on make you own computer on home page
        homePage.clickOnBuildYourOwnComputer();
        //fill the details for make your own computer
        buildYourOwnComputer.buildYourOwnComputer();
        //go on cart page and verify right product is added
        buildYourOwnComputerCartPage.rightProductAdded();
    }

    @Test
    public void toVerifyAlertMsgOnSearchButton() {
        //click on search button on home page
        homePage.clickOnSearchButton();
        //Wait for alert msg on home page and get text
        homePage.searchButtonAlert();

    }

    @Test
    public void toVerifyAlertMsgOnVote() {
        //click on vote button on homepage
        homePage.voteButton();
        //wait for alert to pop up on homepage and verify the msg
        homePage.voteAlert();

    }

    @Test
    public void toVerifyUserShouldHaveLastCommentOnNopCommerceNewRelease() {
        //click on NopCommerce New Release
        homePage.nopCommerceNewRelease();
        //Type title and comment in the box and click on new comment
        nopCommNewReleasePage.nopCommNewReleaseComment();

    }

    @Test
    public void toVerifyAllProductsShouldBeInSameCurrencyWhenChanged() {
        //select the currency from homepage
        homePage.currencySymbol();

    }

    @Test
    public void toVerifyFbPageAndComeBackToHomePage() {
        //click on fb button on home page
        homePage.clickOnFb();
        //go on fb page
        fbPage.fbPage();
        //verify nobComm title on fb page
        fbPage.verifyNopCommOnFbPage();
        //verify url should have fb word
        fbPage.checkUrl();
        //switch back to main page
        fbPage.switchToMainPage();
        //Once back to home page verify Welcome msg
        homePage.welcomeMsg();

    }

    @Test
    public void toVerifySearchAndProductDisplayedShouldBeSame() {
        //type in search box
        homePage.typeInSearchBox();
        //click on search button
        homePage.clickOnSearchButton();
        //verify same product is displayed on search page
        searchedProductPage.searchedProduct();

    }

    @Test
    public void toVerifyAddToCartButtonOnCameraPage() {
        //click on electronics on homepage
        homePage.clickOnElectronics();
        //click on camera category
        electronicsPage.clickOnCameraCategory();
        //Check all products have add to cart button
        cameraAndPhotoPage.addToCartButton();


    }

}