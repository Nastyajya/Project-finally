package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigFactory;
import uitests.config.WebDriverConfig;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ElementPage {
    WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    SelenideElement
            contentCard = $(".experiences_card-content"),
            contentMain = $("#main-content"),
            shareButton = $("#self-start"),
            dialogueButton = $(".fixed.bottom-6"),
            dialogWindow = $(".intercom-ruskli"),
            bannerMessages = $(".intercom-i3hv2l");

    public ElementPage openPage() {
       step("Open page", () -> {
           open(config.getBaseUrl());
       });
        return this;
    }
    public ElementPage setContentCard() {
        step("Click on activity widget", () -> {
            contentCard.click();
        });
            return this;
        }

     public ElementPage setContentMain() {
          contentMain.$("#self-start");
        return this;
    }

    public ElementPage verifyShareButton() {
        step("Checking for the presence of the share element", () -> {  shareButton.shouldBe(hidden);
        });
        return this;
    }

    public ElementPage setDialogueButton() {
        step("Click on the dialogue button", () -> {  dialogueButton.click();
        });
        return this;
    }

    public ElementPage setDialogWindow() {
        dialogWindow.$(".intercom-i3hv2l");
        return this;
    }
    public ElementPage verifyBannerMessages() {
        step("Checking for the presence of the messenger element", () -> { bannerMessages.shouldBe(hidden);
        });
        return this;
    }
}
