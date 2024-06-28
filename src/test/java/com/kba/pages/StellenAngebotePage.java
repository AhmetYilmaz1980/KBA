package com.kba.pages;

import com.kba.utilities.BrowserUtils;
import com.kba.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StellenAngebotePage extends BasePage{
    @FindBy(css = "tbody tr")
    public List<WebElement> stellenList;

    public void clickStelle(String stelleKey){
        for (WebElement element : stellenList){
            if (element.getText().contains("IT")){
                element.click();
            }
        }

    }
}
