package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item_label']/a/div")
    List<WebElement> productNameList;

    public void printProductName() {
        for (WebElement e : productNameList) {
            System.out.println(getTextFromElement(e));
        }
    }
}
