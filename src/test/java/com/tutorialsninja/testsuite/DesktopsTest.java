package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        desktopsPage.setMouseHoverOnDesktop();
        desktopsPage.setClickOnShowAllDesktops();
        desktopsPage.setSelectPosition();
        Assert.assertEquals(desktopsPage.setVerifyProductInDescendingOrder(), "Name (Z - A)");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        desktopsPage.setMouseHoverOnDesktop1();
        desktopsPage.setClickOnShowAllDesktops1();
        desktopsPage.setSelectPositionSortBy();
        desktopsPage.setSelectHPLP3065Product();
        desktopsPage.verifyText();
        Assert.assertEquals(desktopsPage.verifyText(),"HP LP3065", "Error Message not displayed");
        //desktopsPage.selectDeliveryDate();
        desktopsPage.changeQuantity("1");
        desktopsPage.clickOnAdToCart();
        Assert.assertEquals(desktopsPage.getVerifyTextHp(), "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×", "Error Message not displayed");
        desktopsPage.clickOnShoppingCart();
        Thread.sleep(3000);
        Assert.assertEquals(desktopsPage.getVerifyShoppingCart(), "Shopping Cart  (11.00kg)", "Error Message not displayed");
        Assert.assertEquals(desktopsPage.getVerifyProductName(), "HP LP3065", "Error Message not displayed");
        //Assert.assertEquals(desktopsPage.getVerifyDeliveryDate(), "Delivery Date:2011-04-22","Error Message not displayed");
        Assert.assertEquals(desktopsPage.getVerifyModel(), "Product 21", "Error Message not displayed");
        Thread.sleep(2000);
        Assert.assertEquals(desktopsPage.getVerifyTotal(), "$1,342.00", "Error Message not displayed");
    }
}