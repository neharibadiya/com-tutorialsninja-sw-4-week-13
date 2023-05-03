package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopAndNoteBooksPage laptopAndNoteBooksPage = new LaptopAndNoteBooksPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickOnDesktopLink();
        homePage.setSelectMenuMethod();
        Assert.assertEquals(homePage.getVerifyText(),"Desktops", "Error Message not displayed");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.clickOnLaptopNotebooksLink();
        homePage.setSelectMenuMethod1();
        Assert.assertEquals(homePage.getVerifyText1(), "Laptops & Notebooks", "Error Message not displayed");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.clickOnComponentsLink();
        homePage.setSelectMenuMethod2();
        Assert.assertEquals(homePage.getVerifyText2(), "Components", "Error Message not displayed");

    }

}
