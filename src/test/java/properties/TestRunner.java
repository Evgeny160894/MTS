package properties;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = "@Test",
        glue = {"src/test/java/tests/stepsDefinitions"},
        dryRun = false,
        monochrome = false,
        plugin = {"pretty"}
//
//        //plugin = {"pretty", "de.monochromata.cucumber.report.PrettyReports:target/cucumber"}
)
public class TestRunner {

    public static String stand;

    @BeforeClass
    static public void setUpRunner() {

//        stand="DEV8";
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.browser = "chrome";


    }
}


