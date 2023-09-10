package uitests.pages;

import com.codeborne.selenide.SelenideElement;
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


    public PartyPage verifyHeadingWrap(String value) {
        step("Checking for the correct header", () -> {
            headingWrap.shouldHave(text(value));
        });
        return this;
    }

    public PartyPage setContentMain() {
        contentMain.$("#self-start");
        return this;
    }

    public PartyPage verifyShareButton() {
        step("Checking for the presence of the share element", () -> {
            shareButton.shouldBe(hidden);
        });
        return this;
    }
    public PartyPage setDialogueButton() {
        step("Click on the dialogue button", () -> {
            dialogueButton.click();
        });
        return this;
    }
}
