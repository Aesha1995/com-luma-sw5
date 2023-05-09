package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.Womens_Jackets_Page;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class Womens_Jackets_Test extends BaseTest {
    HomePage homePage;
    Womens_Jackets_Page womensJacketsPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        womensJacketsPage = new Womens_Jackets_Page();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        womensJacketsPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womensJacketsPage.getProductList1(),womensJacketsPage.getProductList2());
    }
    @Test(groups = {"smoke","regression"})
    public void verifyTheSortByPriceFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        womensJacketsPage.selectProductNameFilter("Price");
        Assert.assertEquals(womensJacketsPage.getProductPriceList1(),womensJacketsPage.getProductPriceList2());
    }
}
