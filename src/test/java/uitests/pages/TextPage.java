package uitests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextPage {
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
        open("https://www.thebach.com/");
        return this;
    }

    public TextPage verifyStartButton(String value) {
        startButton.shouldHave(text(value));
        return this;
    }

    public TextPage setDropdownMenu() {
        dropdownMenu.click();
        return this;
    }

    public TextPage setTextMenu() {
        textMenu.click();
        return this;
    }

    public TextPage verifyHeadingWrap(String value) {
        headingWrap.shouldHave(text(value));
        return this;
    }

    public TextPage setDropdownToggle() {
        dropdownToggle.hover();
        return this;
    }

    public TextPage verifyDropdownList(String value) {
        dropdownList.shouldHave(text(value));
        return this;
    }

    public TextPage setReviewSlide() {
        reviewSlide.click();
        return this;
    }

    public TextPage verifyNextReviewSlide(String value) {
        nextReviewSlide.shouldHave(text(value));
        return this;
    }

    public TextPage setExploreLink() {
        exploreLink.click();
        $(withText("Nashville, TN")).click();
        return this;
    }

    public TextPage writeTextInput(String value) {
        textInput.setValue(value);
        return this;
    }

    public TextPage verifyAppearText(String value) {
        appearText.shouldHave(text(value));
        return this;
    }

}