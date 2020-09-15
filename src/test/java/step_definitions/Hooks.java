package step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    WebDriver driver;

    @Before
    public void setup() {
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //We are embedding the screenshot as an image in our framework
        //We SHOULD get screenshot after every FAILING Scenario
        //Attaching the image if scenario fails
        if (scenario.isFailed()) {
            scenario.embed(screenshot, "image/png");
        }
    }

    private void driver() {
    }

}