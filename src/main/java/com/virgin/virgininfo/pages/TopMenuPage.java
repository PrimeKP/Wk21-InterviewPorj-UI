package com.virgin.virgininfo.pages;

import com.virgin.virgininfo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/span[1]")
    WebElement freeGameMenu;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"__tealiumGDPRecModal\"]/div/div/div/div[2]/label")
    WebElement acceptCoockie;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"styledApp\"]/div/section[2]/h1")
    WebElement verifyText;

    public void clickOnAcceptCookies(){
       log.info("Click on Accept Coockies on pop up " + acceptCoockie.toString());
        clickOnElement(acceptCoockie);
    }

    public void clickOnFreeGameTabOnTopMenu(){
        log.info("Click on Free Game " + freeGameMenu.toString());
        clickOnElement(freeGameMenu);
    }

    public String getPageTextandVerify(){
        log.info("Verifying text on free game page " + verifyText.toString());
        String actualMessage = getTextFromElement(verifyText);
        return actualMessage;

    }
}
