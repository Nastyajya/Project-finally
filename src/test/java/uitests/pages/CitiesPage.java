package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CitiesPage {
    SelenideElement
            textInput = $("[role=dialog]").$("input");

    public CitiesPage writeTextInput(String value) {
        step("Print the first two letters of the city", () -> {
            textInput.click();
            textInput.setValue(value);
        });
        return this;
    }

}
