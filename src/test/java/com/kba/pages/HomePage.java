package com.kba.pages;

import com.kba.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@title='Karriere']")
    public WebElement karriereMenu;

    public void clickMenu(String menuName){

        WebElement menu = Driver.getDriver().findElement(By.xpath("//a[@title='" + menuName + "']"));
        menu.click();
    }
}
