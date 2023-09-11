package uitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement
            startButton = $("#start-browsing-button"),
            dropdownMenu = $("[id=w-dropdown-toggle-0]"),
            dropdownToggle = $("[id=w-dropdown-toggle-4]"),
            reviewSlide = $("[id=splide03-slide02]"),
            exploreLink = $("#explore-nav-link"),
            contentCard = $(".experiences_card-content"),
            dropdownList = $("[id=w-dropdown-list-4]"),
            nextReviewSlide = $("#splide03-slide03");

    @Step("Open page")
    public MainPage openPage() {
        open("");
        return this;
    }

    @Step("Checking the text on the button")
    public MainPage verifyStartButton(String value) {
        startButton.shouldHave(text(value));
        return this;
    }

    @Step("Сlick on the menu")
    public MainPage setDropdownMenu() {
        dropdownMenu.click();
        return this;
    }

    @Step("Hover over the radar icon")
    public MainPage setDropdownToggle() {
        dropdownToggle.hover();
        return this;
    }

    @Step("Click on next review")
    public MainPage setReviewSlide() {
        reviewSlide.click();
        return this;
    }

    @Step("Go to city selection menu")
    public MainPage setExploreLink() {
        exploreLink.click();
        $(withText("Nashville, TN")).click();
        return this;
    }

    @Step("Click on activity widget")
    public MainPage setContentCard() {
        contentCard.click();
        return this;
    }

    @Step("The text should appear above the radar icon")
    public MainPage verifyDropdownList(String value) {
        dropdownList.shouldHave(text(value));
        return this;
    }

    @Step("The slide should display the correct text")
    public MainPage verifyNextReviewSlide(String value) {
        nextReviewSlide.shouldHave(text(value));
        return this;
    }
}

