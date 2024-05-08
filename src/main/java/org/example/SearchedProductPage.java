package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchedProductPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _searchedProduct = By.xpath("//div[@class='product-item']");

    //when searched a product this page will be opened
    public void searchedProduct() {

        List<WebElement> product = driver.findElements(_searchedProduct);

        for (WebElement element : product) {
            String actProduct = element.getText();

            Assert.assertTrue(actProduct.contains("Nike"), "not found");
        }

    }
}



