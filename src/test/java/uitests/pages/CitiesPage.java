package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;

public class CitiesPage {
    SelenideElement
            textInput = $("[role=dialog]").$("input");
@Step("Print the first two letters of the city")
    public CitiesPage writeTextInput(String value) {
            textInput.click();
            textInput.setValue(value);
        return this;
    }

}
