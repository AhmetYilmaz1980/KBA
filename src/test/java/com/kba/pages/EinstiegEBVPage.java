package com.kba.pages;

import com.kba.utilities.BrowserUtils;
import com.kba.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EinstiegEBVPage extends BasePage{
    public void clicksEbvTyp(String ebvType){
        String title = "BAV  -  Einstieg zum Elektronischen Bewerbungsverfahren (EBV)";
        BrowserUtils.switchToWindow(title);
        WebElement ebv = Driver.getDriver().findElement(By.xpath("//a[text()='" + ebvType + "']"));
        ebv.click();
    }
}
