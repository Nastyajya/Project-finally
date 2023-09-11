package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;

public class DialogPage {
    SelenideElement
            dialogWindow = $(".intercom-ruskli"),
            bannerMessages = $(".intercom-i3hv2l");

    @Step("Click on the dialogue button")
    public DialogPage setDialogWindow() {
        dialogWindow.$(".intercom-i3hv2l");
        return this;
    }

    @Step("Checking for the presence of the messenger element")
    public DialogPage verifyBannerMessages() {
        bannerMessages.shouldBe(hidden);
        return this;
    }
}
