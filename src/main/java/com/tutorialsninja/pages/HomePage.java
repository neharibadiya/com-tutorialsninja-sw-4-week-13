package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type
    //string. This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    //1.1 Mouse hover on “Desktops” Tab and click
    By desktopLink = By.linkText("Desktops");
    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }
    //1.2 call selectMenu method and pass the menu = “Show All Desktops”
    By selectMenuMethod =  By.xpath("//a[contains(text(),'Show AllDesktops')]");
    public void setSelectMenuMethod(){
        clickOnElement(selectMenuMethod);
    }
    //1.3 Verify the text ‘Desktops
    By verifyText = By.xpath("//h2[contains(text(),'Desktops')]");
    public String getVerifyText() {
        return getTextFromElement(verifyText);
    }
    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    By laptopNotebookLink = By.linkText("Laptops & Notebooks");
    public void clickOnLaptopNotebooksLink() {
        clickOnElement(laptopNotebookLink);
    }
    //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    By selectMenuMethod1 = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    public void setSelectMenuMethod1(){
        clickOnElement(selectMenuMethod1);
    }
    //2.3 Verify the text ‘Laptops & Notebooks’
    By verifyText1 = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }
    //3.1 Mouse hover on “Components” Tab and click
    By componentsLink = By.linkText("Components");
    public void clickOnComponentsLink() {
        clickOnElement(componentsLink);
    }
    //3.2 call selectMenu method and pass the menu = “Show All Components”
    By selectMenuMethod2 = By.xpath("//a[contains(text(),'Show AllComponents')]");
    public void setSelectMenuMethod2(){
        clickOnElement(selectMenuMethod2);
    }
    //3.3 Verify the text ‘Components’
    By verifyText2 = By.xpath("//h2[contains(text(),'Components')]");
    public String getVerifyText2() {
        return getTextFromElement(verifyText2);
    }
}
