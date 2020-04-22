package stepsDefinitions.stepHelper;

import io.cucumber.java.ru.Тогда;
import utils.annotations.locatorAnalyzers.LocatorPropAnnotationAnalyzer;
import utils.annotations.namePageAnalyzers.NamePageAnalyzer;

import static com.codeborne.selenide.Selenide.open;

public class PageHelper {

    /**
     *
     * @param link - ссылка для перехода на страницу
     * @param namePage - имя пейджи с которой производится работа
     */
    @Тогда("переход на {string} и работа со страницей {string}")
    public void goAndWorkToPage(String link, String namePage) {
        open(link);
        goAndWorkToPage(namePage);
    }

    /**
     *
     * @param namePage - имя пейджи с которой производится работа
     */
    @Тогда("работа со страницей {string}")
    public void goAndWorkToPage(String namePage) {

        if(NamePageAnalyzer.mapNameClasses.isEmpty()) {
            try {
                new NamePageAnalyzer().creatorMapClass();
                new LocatorPropAnnotationAnalyzer(NamePageAnalyzer.getClass(namePage));
            } catch (Exception e) {
                System.out.println("Ошибка при сборе локаторов на странице. ПОДРОБНАЯ ОШИБКА: " + e);
            }
        }else {
            new LocatorPropAnnotationAnalyzer(NamePageAnalyzer.getClass(namePage));
        }
    }
}
