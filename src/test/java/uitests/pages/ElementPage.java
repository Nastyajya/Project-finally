package uitests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ElementPage {
    SelenideElement
            contentCard = $(".experiences_card-content"),
            contentMain = $("#main-content"),
            shareButton = $("#self-start"),
            textButton = $(".py-4.text-base"),
            dialogueButton = $(".fixed.bottom-6"),
            dialogWindow = $(".intercom-ruskli"),
            bannerMessages = $(".intercom-i3hv2l");

    public ElementPage openPage() {
        open("https://www.thebach.com/");
        return this;
    }
    public ElementPage setContentCard() {
        contentCard.click();
        return this;
    }


    public ElementPage setContentMain() {
        contentMain.$("#self-start");
        return this;
    }

    public ElementPage verifyShareButton() {
        shareButton.shouldBe(hidden);
        return this;
    }

    public ElementPage setTextButton() {
        textButton.click();
        return this;
    }

    public ElementPage setDialogueButton() {
        dialogueButton.click();
        return this;
    }

    public ElementPage setDialogWindow() {
        dialogWindow.$(".intercom-i3hv2l");
        return this;
    }
    public ElementPage verifyBannerMessages() {
        bannerMessages.shouldBe(hidden);
        return this;
    }
}
