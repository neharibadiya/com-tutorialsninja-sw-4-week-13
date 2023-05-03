package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.LaptopAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopAndNoteBooksTest extends BaseTest {
    LaptopAndNoteBooksPage laptopAndNoteBooksPage = new LaptopAndNoteBooksPage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void  verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        laptopAndNoteBooksPage.setMouseHoverOnLaptopNotebookTab();
        laptopAndNoteBooksPage.setClickOnShowAllLaptopAndNotebooks1();
        laptopAndNoteBooksPage.setSelectSortByPrice();
        laptopAndNoteBooksPage.setSelectMacBook();
        Assert.assertEquals(laptopAndNoteBooksPage.getVerifyMacbook(), "MacBook", "Error Message not displayed");
        laptopAndNoteBooksPage.setClickOnAddToCartButton();
        Assert.assertEquals(laptopAndNoteBooksPage.verifySuccessMsg(), "Success: You have added MacBook to your shopping cart!\n" +
                "×");
        laptopAndNoteBooksPage.clickOnShoppingCart();
        Assert.assertEquals(laptopAndNoteBooksPage.getVerifyCart(),"Shopping Cart  (0.00kg)", "Error Message not displayed");
        Thread.sleep(2000);
        Assert.assertEquals(laptopAndNoteBooksPage.getVerifyProductMacbook(),"MacBook", "Error Message not displayed");
        laptopAndNoteBooksPage.clickOnUpdateCart();
        Assert.assertEquals(laptopAndNoteBooksPage.getVerifyCartText(),"Success: You have modified your shopping cart!\n" +
                "×");
        Assert.assertEquals(laptopAndNoteBooksPage.getVerifyTotal(),"$602.00", "Error Message not displayed");
        laptopAndNoteBooksPage.clickOnFinalCheckout();
        Assert.assertEquals(laptopAndNoteBooksPage.getVerifyCheckout(),"Checkout","Error Message not displayed");
     // Assert.assertEquals(laptopAndNoteBooksPage.getVerifyNewCustomer(),"New Customer");
        Thread.sleep(2000);
        laptopAndNoteBooksPage.clickOnGuestCheckout();
        laptopAndNoteBooksPage.clickOnContinueTab();
        laptopAndNoteBooksPage.enterName("Gautam");
        laptopAndNoteBooksPage.enterLastName("Patel");
        laptopAndNoteBooksPage.enterEmail("gautam123@gmail.com");
        laptopAndNoteBooksPage.enterTelephone("07469865328");
        laptopAndNoteBooksPage.enterAddress("pinner Road");
        laptopAndNoteBooksPage.enterCity("watford");
        laptopAndNoteBooksPage.enterPostcode("WD8 9LA");
        laptopAndNoteBooksPage.setCountryName();
        Thread.sleep(2000);
        laptopAndNoteBooksPage.enterState("Surry");
        laptopAndNoteBooksPage.setContinueButton();
        laptopAndNoteBooksPage.clickContinueButton();






    }


    }

