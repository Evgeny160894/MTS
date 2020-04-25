package pages;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;
import utils.annotations.PageName;

@PageName("Гугл")
public class Google {

    @LocatorProp(
            name = "Поиск Гугл",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement searchGoogle;

    @LocatorProp(
            name = "ссылка на яндекс",
            xpath = "(//h3[text()='Яндекс'])[1]")
    public SelenideElement yandexLink;

}
