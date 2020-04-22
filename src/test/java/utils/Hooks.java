package utils;

import org.junit.After;
import org.junit.BeforeClass;
import stepsDefinitions.Main;
import utils.annotations.namePageAnalyzers.NamePageAnalyzer;

public class Hooks {
    @BeforeClass
    public void beforeClass() {
        NamePageAnalyzer namePageAnalyzer = new NamePageAnalyzer();
        namePageAnalyzer.creatorMapClass();
    }

    @After
    public void resetLocatorsMap() {
        Main.locatorsMap.clear();
    }
}
