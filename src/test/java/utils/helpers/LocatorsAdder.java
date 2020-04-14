package utils.helpers;

import stepsDefinitions.BasicSteps;
import utils.annotations.locatorAnalyzers.LocatorPropAnnotationAnalyzer;

public class LocatorsAdder {
    public LocatorsAdder(Class<?> clazz) {
        try {
            LocatorPropAnnotationAnalyzer locatorPropAnnotationAnalyzer = new LocatorPropAnnotationAnalyzer();
            locatorPropAnnotationAnalyzer.LocatorPropAnnotationAnalyzer(clazz);

            if(BasicSteps.locatorsMap == null) {BasicSteps.locatorsMap = locatorPropAnnotationAnalyzer.locators;}
        }catch (Exception e) {
            System.out.println("При сборе локаторов возникла ошибка " + e);
        }
    }
}
