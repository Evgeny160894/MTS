package pages;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;
import utils.annotations.PageName;

@PageName("Яндекс")
public class Yandex {

    @LocatorProp(
            name = "Поле поиска Яндекс",
            xpath = "//input[@aria-label='Запрос']")
    public SelenideElement yandexSearchField;

}
