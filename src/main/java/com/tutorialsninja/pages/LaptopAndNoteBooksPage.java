package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNoteBooksPage extends Utility {
    //2.1 Mouse hover on Laptops & Notebooks Tab and click
    By mouseHoverOnLaptopNotebookTab = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    public void setMouseHoverOnLaptopNotebookTab(){
        mouseHoverToElementAndClick(mouseHoverOnLaptopNotebookTab);
    }

    //2.2 Click on “Show All Laptops & Notebooks”
    By clickOnShowAllLaptopAndNotebooks1 = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
    public void setClickOnShowAllLaptopAndNotebooks1(){
        clickOnElement(clickOnShowAllLaptopAndNotebooks1);
    }
    //2.3 Select Sort By "Price (High > Low)"
    By selectSortByPrice = By.xpath("//select[@id='input-sort']");
    public void setSelectSortByPrice(){
        selectByVisibleTextFromDropDown(selectSortByPrice,"Price (High > Low)");
    }
    //2.4 Select Product “MacBook”
    By selectMacBook = By.xpath("//a[normalize-space()='MacBook']");
    public void setSelectMacBook() {
        clickOnElement(selectMacBook);
    }
    //2.5 Verify the text “MacBook”
    By verifyMacbook = By.xpath("//h1[contains(text(),'MacBook')]");
    public String getVerifyMacbook() {
        return getTextFromElement(verifyMacbook);
    }
    //2.6 Click on ‘Add To Cart’ button
    By clickOnAddToCartButton = By.xpath("//button[@id='button-cart']");
    public void setClickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }
    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    By verifySuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String verifySuccessMsg(){
        return getTextFromElement(verifySuccess);
    }
    //2.8 Click on link “shopping cart” display into success message
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    //2.9 Verify the text "Shopping Cart"
    By verifyCart = By.xpath("//h1[contains(text(),' (0.00kg)')]");

    public String getVerifyCart() {
        return getTextFromElement(verifyCart);
    }
    //2.10 Verify the Product name "MacBook"
    By verifyProductMacbook = By.linkText("MacBook");

    public String getVerifyProductMacbook() {
        return getTextFromElement(verifyProductMacbook);
    }
    //2.11 Change Quantity "2"

    //2.12 Click on “Update” Tab
    By updateCart = By.xpath("//button[@type='submit']");

    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }
    //2.13 Verify the message “Success: You have modified your shopping cart!”
    By verifyCartText = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public String getVerifyCartText() {
        return getTextFromElement(verifyCartText);
    }
    //2.14 Verify the Total £737.45
    By verifyTotal = By.xpath("//tbody//tr//td[6]");

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    //2.15 Click on “Checkout” button
    By clickOnCheckout = By.xpath("//a[contains(text(),'Checkout')]");

    public void clickOnFinalCheckout() {
        clickOnElement(clickOnCheckout);
    }
    //2.16 Verify the text “Checkout”
    By verifyCheckout = By.xpath("//a[contains(text(),'Checkout')]");
    public String getVerifyCheckout() {
        return getTextFromElement(verifyCheckout);
    }
    //2.17 Verify the Text “New Customer”
    By verifyNewCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    public String getVerifyNewCustomer() {
        return getTextFromElement(verifyNewCustomer);
    }
    //2.18 Click on “Guest Checkout” radio button
    By guestCheckout = By.xpath("//h2[contains(text(),'New Customer')]");
    public void clickOnGuestCheckout() {
        clickOnElement(guestCheckout);
    }
    //2.19 Click on “Continue” tab
    By continueTab = By.xpath("//input[@id='button-account']");

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    //2.20 Fill the mandatory fields
    By nameField = By.name("firstname");

    public void enterName(String name) {
        sendTextToElement(nameField, name);
    }

    By lastnameField = By.name("lastname");

    public void enterLastName(String lastname) {
        sendTextToElement(lastnameField, lastname);
    }

    By emailField = By.id("input-payment-email");

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    By telePhone = By.name("telephone");

    public void enterTelephone(String phone) {
        sendTextToElement(telePhone, phone);
    }

    By addressLine = By.name("address_1");

    public void enterAddress(String street) {
        sendTextToElement(addressLine, street);
    }

    By cityName = By.name("city");

    public void enterCity(String city) {
        sendTextToElement(cityName, city);
    }

    By postCode = By.name("postcode");

    public void enterPostcode(String code) {
        sendTextToElement(postCode, code);
    }

    By countryName = By.xpath("//option[contains(text(),'United Kingdom')]");

    public void setCountryName() {
        selectByVisibleTextFromDropDown(countryName,"United Kingdom");
    }

    By zoneName = By.xpath("//select[@id='input-payment-zone']");

    public void enterState(String state) {
        sendTextToElement(zoneName, state);
    }

    //2.21 Click on “Continue” Button
    By ContinueButton = By.xpath("//input[@value='Continue'])[2]");

    public void setContinueButton() {
        clickOnElement(ContinueButton);
    }
    //2.24 Click on “Continue” button
    By lastContinueButton = By.xpath("//a[contains(text(),'Continue')]");

    public void clickContinueButton() {
        clickOnElement(lastContinueButton);
    }
    //2.25 Verify the message “Warning: Payment method required!
    By warningMsg = By.xpath("//div[contains(@class,'alert alert-danger')]");

    public String getVerifyWarningMsg() {
        return getTextFromElement(warningMsg);
    }
}
