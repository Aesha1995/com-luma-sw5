package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

    public void mouseHoverOnWomenMenu() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover on WomenMenu"+womenMenu);
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Tops"+tops);
        mouseHoverToElement(tops);
    }
    public void clickOnJackets() {
        CustomListeners.test.log(Status.PASS,"Click on Jackets"+jackets);
        clickOnElement(jackets);
    }
    public void mouseHoverOnMenMenu() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover on MenMenu"+menMenu);
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottom() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Bottom"+bottomMenu);
        mouseHoverToElement(bottomMenu);
    }
    public void clickOnPant() {
        CustomListeners.test.log(Status.PASS,"Click on Pant"+pants);
        clickOnElement(pants);
    }
    public void mouseHoverOnGearMenu() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover on GearMenu"+gearMenu);
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags() {
        CustomListeners.test.log(Status.PASS,"Click on Pant"+bags);
        clickOnElement(bags);
    }
}
