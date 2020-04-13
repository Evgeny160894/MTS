package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import utils.annotations.LocatorTitle;

public class Google {

    @LocatorTitle(
            name = "Поиск Гугл",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement searchGoogle;

    @LocatorTitle(
            name = "Кнопка Купить",
            xpath = "//input[@aria-label='Найти']")
    public SelenideElement buyButton;

}
