package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NopCommNewReleasePage extends Utils {

    LoadProp loadProp = new LoadProp();
    private By _titleOfComment = By.className("enter-comment-title");
    private By _commInCommBox = By.className("enter-comment-text");
    private By _clickOnNewCommentButton = By.name("add-comment");
    private By actualcomm = By.xpath(" //p[.='Products are good']");


    public void nopCommNewReleaseComment() {
        //title of the comment
        typeText(_titleOfComment, loadProp.getProperty("nopCommCommentTitle"));

        //write comment in comment box
        typeText(_commInCommBox, loadProp.getProperty("commentInNopCommBoxExp"));

        //click on add comment
        clickOnElement(_clickOnNewCommentButton);

//        to assert my users comment is the last in comment
        String actComment = getText(actualcomm);
        Assert.assertEquals(actComment, loadProp.getProperty("commentInNopCommBoxExp"), "Wrong users comment");

    }


}

