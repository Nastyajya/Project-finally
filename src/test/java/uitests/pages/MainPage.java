package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigFactory;
import uitests.config.WebDriverConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {
    WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    SelenideElement
            startButton = $("#start-browsing-button"),
            dropdownMenu = $("[id=w-dropdown-toggle-0]"),
            dropdownToggle = $("[id=w-dropdown-toggle-4]"),
            reviewSlide = $("[id=splide03-slide02]"),
            exploreLink = $("#explore-nav-link"),
            contentCard = $(".experiences_card-content"),
            dropdownList = $("[id=w-dropdown-list-4]"),
            nextReviewSlide = $("#splide03-slide03");

    public MainPage openPage() {
        step("Open page", () -> {
            open(config.getBaseUrl());
        });
        return this;
    }

    public MainPage verifyStartButton(String value) {
        step("Checking the text on the button", () -> {
            startButton.shouldHave(text(value));
        });
        return this;
    }

    public MainPage setDropdownMenu() {
        step("Сlick on the menu", () -> {
            dropdownMenu.click();
        });
        return this;
    }

    public MainPage setDropdownToggle() {
        step("Hover over the radar icon", () -> {
            dropdownToggle.hover();
        });
        return this;
    }
    public MainPage setReviewSlide() {
        step("Click on next review", () -> {
            reviewSlide.click();
        });
        return this;
    }
    public MainPage setExploreLink() {
        step("Go to city selection menu", () -> {
            exploreLink.click();
            $(withText("Nashville, TN")).click();
        });
        return this;
    }
    public MainPage setContentCard() {
        step("Click on activity widget", () -> {
            contentCard.click();
        });
        return this;
    }
    public MainPage verifyDropdownList(String value) {
        step("The text should appear above the radar icon", () -> {
            dropdownList.shouldHave(text(value));
        });
        return this;
    }
    public MainPage verifyNextReviewSlide(String value) {
        step("The slide should display the correct text", () -> {
            nextReviewSlide.shouldHave(text(value));
        });
        return this;
    }
}

