package pages;

import com.codeborne.selenide.SelenideElement;
import utils.annotations.LocatorProp;
import utils.annotations.PageName;

@PageName("сайт про xpath")
public class Xpath {

    @LocatorProp(
            name = "Синтаксис xpath",
            xpath = "//h1[text()='Синтаксис XPath']")
    public SelenideElement linkBatFiles;
}
