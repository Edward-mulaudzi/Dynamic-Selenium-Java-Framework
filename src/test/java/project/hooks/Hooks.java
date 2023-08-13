package project.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.utils.BaseClass;

public class Hooks extends BaseClass {
    @Before
    public void browser_is_launched() {
        try {
            System.out.println("Browser is launched");
            LaunchApplication();
            createPageInstance();
        } catch (Exception e) {
            System.out.println("");
        }
    }
    @AfterStep
    public void takeScreenShot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "ScreenShot");
    }

    @After
    public void closeBrowser() {
        System.out.println("Browser Closed");
        driver.quit();
    }
}