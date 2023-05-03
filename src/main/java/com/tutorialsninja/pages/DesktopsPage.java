package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    //1.1 Mouse hover on Desktops Tab.and click
     By mouseHoverOnDesktop = By.xpath("//a[normalize-space()='Desktops']");
     public void setMouseHoverOnDesktop(){
         mouseHoverToElementAndClick(mouseHoverOnDesktop);
     }
    //1.2 Click on “Show All Desktops”
    By clickOnShowAllDesktops = By.xpath("//a[contains(text(),'Show AllDesktops')]");
     public void setClickOnShowAllDesktops(){
         clickOnElement(clickOnShowAllDesktops);
     }
    //1.3 Select Sort By position "Name: Z to A"
    By selectPosition = By.xpath("//select[@id='input-sort']");
     public void setSelectPosition(){
         selectByVisibleTextFromDropDown(selectPosition,"Name (Z - A)");
     }
    //1.4 Verify the Product will arrange in Descending order.
    By verifyProductInDescendingOrder = By.xpath("//option[contains(text(),'Name (Z - A)')]");
     public String setVerifyProductInDescendingOrder(){
         return getTextFromElement(verifyProductInDescendingOrder);
     }

     //2.1 Mouse hover on Desktops Tab. and click
     By mouseHoverOnDesktop1 = By.xpath("//a[normalize-space()='Desktops']");
    public void setMouseHoverOnDesktop1(){
        mouseHoverToElementAndClick(mouseHoverOnDesktop1);
    }
    //2.2 Click on “Show All Desktops”
    By clickOnShowAllDesktops1 = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    public void setClickOnShowAllDesktops1(){
        clickOnElement(clickOnShowAllDesktops1);
    }
    //2.3 Select Sort By position "Name: A to Z"
    By selectPositionSortBy = By.xpath("//select[@id='input-sort']");
    public void setSelectPositionSortBy(){
        selectByVisibleTextFromDropDown(selectPositionSortBy, "Name (A - Z)");
    }
    //2.4 Select product “HP LP3065”
    By selectHPLP3065Product = By.xpath("//a[normalize-space()='HP LP3065']");
    public void setSelectHPLP3065Product(){
        clickOnElement(selectHPLP3065Product);
    }
    //2.5 Verify the Text "HP LP3065"
    By verifyTheText = By.xpath("//h1[normalize-space()='HP LP3065']");
    public String verifyText(){
        return getTextFromElement(verifyTheText);
    }
    //2.6 Select Delivery Date "2022-11-30"

    //2.7.Enter Qty "1” using Select class.
    By selectQuantity = By.name("quantity");
    public void changeQuantity(String quantity) {
        sendTextToElement(selectQuantity, quantity);
    }
    //2.8 Click on “Add to Cart” button
    By addToCart = By.xpath("//button[@id='button-cart']");
    public void clickOnAdToCart() {
        clickOnElement(addToCart);
    }
    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    By verifyTextHpLp3065 = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public String getVerifyTextHp() {
        return getTextFromElement(verifyTextHpLp3065);
    }
    //2.10 Click on link “shopping cart” display into success message
    By clickShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    public void clickOnShoppingCart() {
        clickOnElement(clickShoppingCart);
    }
    //2.11 Verify the text "Shopping Cart"
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    public String getVerifyShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }
    //2.12 Verify the Product name "HP LP3065"
    By verifyHPlp3065 = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    public String getVerifyProductName() {
        return getTextFromElement(verifyHPlp3065);
    }
    //2.13 Verify the Delivery Date "2022-11-30"
    By verifyDate = By.xpath("//small[normalize-space()='Delivery Date:2011-04-22']");
    public String getVerifyDeliveryDate() {
        return getTextFromElement(verifyDate);
    }
    //2.14 Verify the Model "Product21"
    By verifyModel = By.xpath("//td[normalize-space()='Product 21']");
    public String getVerifyModel() {
        return getTextFromElement(verifyModel);
    }
    //2.15 Verify the Todat "£74.73"
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }
}
