package stepsDefinitions;

import utils.annotations.locatorAnalyzers.LocatorPropAnnotationAnalyzer;

import java.util.Map;

public class BasicSteps {
    protected Class clazz;
    protected static Map<String, String> lm;

    public void searchLocators() throws Exception{
        LocatorPropAnnotationAnalyzer locatorPropAnnotationAnalyzer = new LocatorPropAnnotationAnalyzer();
        locatorPropAnnotationAnalyzer.LocatorPropAnnotationAnalyzer(this.clazz);

        lm = locatorPropAnnotationAnalyzer.locators;
    }
}
