package com.kba.pages;

import com.kba.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KarrierePage extends BasePage{

    @FindBy(xpath = "//h3[text()='Unsere Stellenangebote']")
    public WebElement unsereStellenAngeboteItem;

    public void clickKarriereItem(String itemName){
        WebElement item = Driver.getDriver().findElement(By.xpath("//h3[text()='" + itemName + "']"));
        item.click();
    }
}
