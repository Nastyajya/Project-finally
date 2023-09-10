package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {
    SelenideElement
            textMenu = $(byText("Miami Bachelorette Party")),
            appearText = $("li.py-3");

    @Step("Сlick on city guides")
    public DropdownPage setTextMenu() {
        textMenu.click();
        return this;
    }
@Step("Check that a list with the full name of the city is displayed")
    public DropdownPage verifyAppearText(String value) {
            appearText.shouldHave(text(value));
        return this;
    }
}