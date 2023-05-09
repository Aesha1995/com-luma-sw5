package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.*;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    MenPage menPage;
    ShoppingCartPage shoppingCartPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        menPage = new MenPage();
        shoppingCartPage = new ShoppingCartPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottom();
        homePage.clickOnPant();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnColor();
        menPage.clickOnAddToCart();
        Assert.assertEquals(menPage.getTextAfterAddToCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getCronusYogaPantText(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.getSizeText(),"32");
        Assert.assertEquals(shoppingCartPage.getColorText(),"Black");
    }
}
