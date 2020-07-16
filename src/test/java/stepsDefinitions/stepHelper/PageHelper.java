package stepsDefinitions.stepHelper;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.Тогда;
import stepsDefinitions.Main;
import utils.annotations.locatorAnalyzers.LocatorPropAnnotationAnalyzer;
import utils.annotations.namePageAnalyzers.NamePageAnalyzer;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.open;

public class PageHelper extends Main {

    public static String CURRENT_NAME_PAGE;
    public static Class<?> CURRENT_CLASS;


    /**
     * @param link     - ссылка для перехода на страницу
     * @param namePage - имя пейджи с которой производится работа
     */
    @Тогда("переход на {string} и работа со страницей {string}")
    public void goAndWorkToPage(String link, String namePage) {
        open(link);
        goAndWorkToPage(namePage);
    }

    /**
     * @param namePage - имя пейджи с которой производится работа
     */
    @Тогда("работа со страницей {string}")
    public void goAndWorkToPage(String namePage) {

        if (NamePageAnalyzer.mapNameClasses.isEmpty()) {
            try {
                new NamePageAnalyzer().creatorMapClass();
                new LocatorPropAnnotationAnalyzer(NamePageAnalyzer.getClass(namePage));

                goToCurrentPage();
                CURRENT_CLASS = NamePageAnalyzer.getClass(namePage);
                CURRENT_NAME_PAGE = namePage;
            } catch (Exception e) {
                System.out.println("Ошибка при сборе локаторов на странице. ПОДРОБНАЯ ОШИБКА: " + e);
            }
        } else {
            new LocatorPropAnnotationAnalyzer(NamePageAnalyzer.getClass(namePage));

            goToCurrentPage();
            CURRENT_CLASS = NamePageAnalyzer.getClass(namePage);
            CURRENT_NAME_PAGE = namePage;
        }
    }

    /**
     * Нажать на ссылку с текстом
     *
     * @param textLink - полный текст из ссылки
     * @param namePage - имя пейджи с которой производится работа
     */
    @Тогда("нажать на ссылку с текстом {string} и работа со страницей {string}")
    public void clickLinkWithText(String textLink, String namePage) {
        elementsUtil.clickOnHyperLink(textLink);
        goAndWorkToPage(namePage);
    }

    /**
     * Закрытие текущей открытой вкладки браузера
     *
     * @param namePage - имя пейджи с которой производится работа
     */
    @Тогда("закрыть текущую вкладку и работа со страницей {string}")
    public void quitTabAndWorkToPage(String namePage) {
        WebDriverRunner.getWebDriver().close();
        goToCurrentPage();
        goAndWorkToPage(namePage);
    }

    /**
     * Закрытие текущей открытой вкладки браузера
     */
    @Тогда("закрыть текущую вкладку")
    public void quitTab() {
        WebDriverRunner.getWebDriver().close();
        goToCurrentPage();
    }

    /**
     * Переключение на активную вкладку
     */
    public void goToCurrentPage() {
        ArrayList<String> tabs = new ArrayList<>(WebDriverRunner.getWebDriver().getWindowHandles());
        // Переключение на последнюю открытую вкладку
        WebDriverRunner.getWebDriver().switchTo().window(tabs.get(tabs.size()-1));
    }
}
