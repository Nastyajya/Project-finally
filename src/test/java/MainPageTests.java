import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTests extends TestBase{

    @Test
    void textCheckButtonTest() {
        open();
        $("#start-browsing-button").shouldHave(Condition.text("Start browsing now"));
    }

    @Test
    void validTextCheckTest() {
        open("https://www.thebach.com");
        $("[id=w-dropdown-toggle-0]").hover().click();
        $(byText( "Miami Bachelorette Party")).click();
        $(".city-hero_heading-wrap").shouldHave(Condition.text("Planning a 2023 Miami"));
    }

    @Test
    void checkShareButtonTest() {
        open("https://www.thebach.com");
        $(".experiences_card-content").click();
       $("#main-content").$("#self-start").shouldBe(hidden);
    }

    @Test
    void checkTextAppearsHoverTest() {
        open("https://www.thebach.com");
        $("[id=w-dropdown-toggle-4]").hover();
        $("[id=w-dropdown-list-4]").shouldHave(text("Las Vegas, NV"));
    }

    @Test
    void textShouldChangeAfterClickingTest(){
        open("https://www.thebach.com");
        $("[id=splide03-slide02]").click();
        $("#splide03-slide03").shouldHave(text("Such a cool app!"));
    }
    @Test
    void test() {
        open("https://www.thebach.com");
        $("#explore-nav-link").click();
        $(withText("Nashville, TN")).click();
        $("[role=dialog]").$("input").setValue("ca");
        $("li.py-3").shouldHave(text("California"));
    }

    @Test
    void checkAppearsBannerTest() {
        open("https://www.thebach.com");
        $(".fixed.inset-x-2").shouldBe(visible, Duration.ofSeconds(30));
    }
}