package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigFactory;
import uitests.config.WebDriverConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TextPage {
    WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    SelenideElement
            startButton = $("#start-browsing-button"),
            dropdownMenu = $("[id=w-dropdown-toggle-0]"),
            textMenu = $(byText("Miami Bachelorette Party")),
            headingWrap = $(".city-hero_heading-wrap"),
            dropdownToggle = $("[id=w-dropdown-toggle-4]"),
            dropdownList = $("[id=w-dropdown-list-4]"),
            reviewSlide = $("[id=splide03-slide02]"),
            nextReviewSlide = $("#splide03-slide03"),
            exploreLink = $("#explore-nav-link"),
            textInput = $("[role=dialog]").$("input"),
            appearText = $("li.py-3");

    public TextPage openPage() {
        step("Open page", () -> {
            open(config.getBaseUrl());
        });
        return this;
    }

    public TextPage verifyStartButton(String value) {
        step("Checking the text on the button", () -> {
            startButton.shouldHave(text(value));
        });
        return this;
    }

   public TextPage setDropdownMenu() {
        step("Сlick on the menu", () -> {
            dropdownMenu.click();
        });
        return this;
    }

    public TextPage setTextMenu() {
        step("Сlick on city guides", () -> {
            textMenu.click();
        });
        return this;
    }

    public TextPage verifyHeadingWrap(String value) {
        step("Checking for the correct header", () -> {
            headingWrap.shouldHave(text(value));
        });
        return this;
    }

    public TextPage setDropdownToggle() {
        step("Hover over the radar icon", () -> {
            dropdownToggle.hover();
        });
        return this;
    }

    public TextPage verifyDropdownList(String value) {
        step("The text should appear above the radar icon", () -> {
            dropdownList.shouldHave(text(value));
        });
        return this;
    }

    public TextPage setReviewSlide() {
        step("Click on next review", () -> {
            reviewSlide.click();
        });
        return this;
    }

    public TextPage verifyNextReviewSlide(String value) {
        step("The slide should display the correct text", () -> {
            nextReviewSlide.shouldHave(text(value));
        });
        return this;
    }

    public TextPage setExploreLink() {
        step("Go to city selection menu", () -> {
            exploreLink.click();
            $(withText("Nashville, TN")).click();
        });
        return this;
    }

    public TextPage writeTextInput(String value) {
        step("Print the first two letters of the city", () -> {
            textInput.click();
            textInput.setValue(value);
        });
        return this;
    }

    public TextPage verifyAppearText(String value) {
        step("Check that a list with the full name of the city is displayed", () -> {
            appearText.shouldHave(text(value));
        });
        return this;
    }

}