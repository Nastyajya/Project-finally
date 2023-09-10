package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class DialogPage {
    SelenideElement
            dialogWindow = $(".intercom-ruskli"),
            bannerMessages = $(".intercom-i3hv2l");

    public DialogPage setDialogWindow() {
        dialogWindow.$(".intercom-i3hv2l");
        return this;
    }
    public DialogPage verifyBannerMessages() {
        step("Checking for the presence of the messenger element", () -> { bannerMessages.shouldBe(hidden);
        });
        return this;
    }
}
