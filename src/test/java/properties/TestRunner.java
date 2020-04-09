package properties;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = "@Test",
        glue = {"stepsDefinitions"},
        dryRun = false,
        monochrome = false,
        plugin = {"pretty"}

//        //plugin = {"pretty", "de.monochromata.cucumber.report.PrettyReports:target/cucumber"}
)
public class TestRunner {
    @BeforeClass
    static public void setUpRunner() {
//        stand="DEV8";
        ChromeOptions option = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.browser = "chrome";
    }
}


