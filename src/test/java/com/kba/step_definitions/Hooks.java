package com.kba.step_definitions;


import com.kba.utilities.ConfigReader;
import com.kba.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before()
    public void setUp() {
       // Driver.getDriver().get(ConfigReader.get("url"));
    }

    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
       // Driver.closeDriver();
    }


}
