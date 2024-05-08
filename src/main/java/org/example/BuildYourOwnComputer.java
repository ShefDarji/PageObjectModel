package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _HDD = By.xpath("//input[@id='product_attribute_3_7']");

    private By _OS = By.xpath("//input[@id='product_attribute_4_9']");
    private By _software = By.xpath("//input[@id='product_attribute_5_11']");
    private By _addToCart = By.xpath("//button[@id='add-to-cart-button-1']");

    public void buildYourOwnComputer() {
//select second drop down from RAM
        selectByValue(By.name("product_attribute_2"), loadProp.getProperty("ram"));
//select second drop down for HDD
        clickOnElement(_HDD);
//select second option for OS
        clickOnElement(_OS);
//select second option for Software
        clickOnElement(_software);
//click on add to cart
        clickOnElement(_addToCart);
//to click green tab on top of the button we need to wait for few second
        elementToBeClickable(10, (By.xpath("//div[@class='bar-notification success']")));
//click on shopping cart on that green tab
        clickOnElement(By.xpath("//p/a['shopping cart']"));


    }


}
