package utils;

import com.codeborne.selenide.Condition;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import stepsDefinitions.stepHelper.PageHelper;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ElementsUtil {


    public static ElementsUtil elementsUtil() {
        final ElementsUtil elementsUtil = new ElementsUtil();
        return elementsUtil;
    }

    /**
     * Клик по элементу без ожидания его появления
     *
     * @param locator - локатор элемента
     */
    public ElementsUtil elementClick(String locator) {
        $(byXpath(locator)).click();

        return this;
    }

    /**
     * Клик по элементу с ожиданием
     *
     * @param locator    - локатор элемента
     * @param waitSecond - ожидание в секундах
     */
    public ElementsUtil elementClick(String locator, int waitSecond) {
        $(byXpath(locator))
                .waitUntil(Condition.visible, waitSecond * 1000)
                .click();

        return this;
    }

    /**
     * Кликает на ссылку найденую по тексту
     *
     * @param text - текст ссылки
     */
    public void clickOnHyperLink(String text) {
        $(By.linkText(text)).click();
    }

    /**
     * Проверка отображения элемента
     *
     * @param locator       - локатор элемента
     * @param needException - локатор элемента
     * @return - вернет true, если элемент найден, в противном случае false
     */
//    @SneakyThrows
    public Boolean checkVisibleElement(String locator, boolean needException) {

        boolean success = false;

        try {
            if (!($(byXpath(locator)).isDisplayed()) && needException) {
                throw new Exception("Элемент \"" + locator + "\" не найден на странице \"" + PageHelper.CURRENT_NAME_PAGE + "\"");
            } else {
                success = $(byXpath(locator)).isDisplayed();
            }
        }catch (Exception e) {
            System.out.println("Элемент \"" + locator + "\" не найден на странице \"" + PageHelper.CURRENT_NAME_PAGE + "\"");
            System.out.println("ПОДРОБНАЯ ОШИБКА: " + e);
            System.exit(1);
        }

        return success;
    }

    /**
     * Сравнить значение элемента с ожидаемым
     *
     * @param locator       - xpath из которого будет браться значение
     * @param expectedText  - значение с которым будет сравниваться
     * @param needException - вывод ошибки при несоответствии значений
     */
    public Boolean compareValueFromElement(String locator, String expectedText, boolean needException) {

        boolean success = false;
        try {
            if (!$(byXpath(locator)).getText().equals(expectedText) && needException) {
                throw new Exception("Текст в поле \"" + locator + "\" НЕ соответствует ожидаемому \"" + expectedText + "\".");
            } else {
                success = $(byXpath(locator)).getText().equals(expectedText);
            }
        }catch (Exception e) {
            System.out.println("Текст в поле \"" + locator + "\" НЕ соответствует ожидаемому \"" + expectedText + "\".");
            System.out.println("ПОДРОБНАЯ ОШИБКА: " + e);
            System.exit(1);
        }

        return success;
    }

    /**
     * Взять текст из элемента по локатору
     *
     * @param locator - xpath элемента
     * @return - возвращаемое значение типа String
     */
    public String getElementValue(String locator) {
        return $(By.xpath(locator)).getText();
    }

    /**
     * Взять текст из элемента по локатору ожидая его появления
     *
     * @param locator    - xpath элемента
     * @param waitSecond - время ожидания появления элемента в секундах
     * @return - возвращаемое значение типа String
     */
    public String getElementValue(String locator, int waitSecond) {
        return $(By.xpath(locator)).waitUntil(Condition.visible, waitSecond * 1000).getText();
    }

    /**
     * Нажатие на кнопку ENTER
     */
    public void enter() {

    }


}
