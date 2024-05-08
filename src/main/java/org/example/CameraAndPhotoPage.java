package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhotoPage extends Utils {

    private By _cameraButton = By.xpath("//div[@class=\"item-grid\"]//div[1]/div[1]/div[2]/div[3]/div[2]/button[@class='button-2 product-box-add-to-cart-button']");

    private By _addToCart = By.className("item-box");

    //click on camera product which you want to refer
    public void clickOnCameraProduct() {
        clickOnElement(_cameraButton);
    }

    //method to verify add to cart button
    public void addToCartButton() {

        List<WebElement> productlist = driver.findElements(_addToCart);

        System.out.println(productlist.size());

        for (WebElement element : productlist) {
            String button = element.getText();
            System.out.println(element.getSize());

            Assert.assertTrue(button.contains("Add to cart"), "Add to cart is missing");

        }


    }


}
