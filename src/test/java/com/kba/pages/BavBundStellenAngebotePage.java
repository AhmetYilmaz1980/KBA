package com.kba.pages;

import com.kba.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class BavBundStellenAngebotePage extends BasePage {
    @FindBy(xpath = "//a[text()='Jetzt bewerben']")
    public WebElement jetztBewerbenButton;


    public void clickBewerbenButton() {
        String pageTitle = "BAV  -  Stellenangebote - Jobbörse - IT-Netzwerkadministratorin / IT-Netzwerkadministrator (m/w/d)";
        BrowserUtils.switchToWindow(pageTitle);
        jetztBewerbenButton.click();
    }

}
