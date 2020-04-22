package pages;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;
import utils.annotations.PageName;

@PageName("Яндекс")
public class Yandex {

    @LocatorProp(
            name = "Поле Яндекса",
            xpath = "ыыы")
    public SelenideElement searchGoogle;

    @LocatorProp(
            name = "Поиск Гугл",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement searchGoogle1;
}
