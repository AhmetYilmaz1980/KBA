package com.kba.pages;

import com.kba.utilities.BrowserUtils;
import com.kba.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KandidatenregistrierungPage {




    public void verifayPagetitle(String pageTitle){
        BrowserUtils.switchToWindow(pageTitle);
        BrowserUtils.verifyTitle(pageTitle);

    }

    }




