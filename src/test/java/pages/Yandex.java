package pages;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;

public class Yandex {

    @LocatorProp(
            name = "Поле Яндекса",
            xpath = "ыыы")
    public SelenideElement searchGoogle;

    @LocatorProp(
            name = "Поиск Гугла",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement searchGoogle1;
}
