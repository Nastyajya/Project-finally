import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
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
        //sleep(3000);
    }

    @Test
    void test(){
        open();
        $(".experiences_card-content").click();


    }

}
