package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class PartyPage {
    SelenideElement
            headingWrap = $(".city-hero_heading-wrap"),
            contentMain = $("#main-content"),
            shareButton = $("#self-start"),
            dialogueButton = $(".fixed.bottom-6");

@Step("Checking for the correct header")
    public PartyPage verifyHeadingWrap(String value) {
            headingWrap.shouldHave(text(value));
        return this;
    }

    public PartyPage setContentMain() {
        contentMain.$("#self-start");
        return this;
    }
@Step("Checking for the presence of the share element")
    public PartyPage verifyShareButton() {
            shareButton.shouldBe(hidden);
        return this;
    }
    @Step("Click on the dialogue button")
    public PartyPage setDialogueButton() {
            dialogueButton.click();
        return this;
    }
}
