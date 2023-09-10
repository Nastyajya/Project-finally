package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class DropdownPage {
    SelenideElement
            textMenu = $(byText("Miami Bachelorette Party")),
            appearText = $("li.py-3");

    public DropdownPage setTextMenu() {
        step("Сlick on city guides", () -> {
            textMenu.click();
        });
        return this;
    }

    public DropdownPage verifyAppearText(String value) {
        step("Check that a list with the full name of the city is displayed", () -> {
            appearText.shouldHave(text(value));
        });
        return this;
    }
}