package org.example;

import org.openqa.selenium.By;

public class CameraCartPage extends Utils {
    private By _referFriendButton = By.xpath("//button[@class='button-2 email-a-friend-button']");

    //camera add to cart page to send email to refer
    public void referAFriend() {

        clickOnElement(_referFriendButton);
    }
}
