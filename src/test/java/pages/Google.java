package pages;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;

public class Google {

    @LocatorProp(
            name = "Поиск Гугл",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement searchGoogle;

    @LocatorProp(
            name = "Кнопка Купить",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement buyButton;
}
