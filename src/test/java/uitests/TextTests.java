package uitests;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import uitests.pages.TextPage;
@Owner("A.Zelenskaia")
@Epic("UI")
public class TextTests extends TestBase {
    TextPage textPage = new TextPage();

    @Test
    public void textCheckButtonTest() {
        textPage.openPage()
                .verifyStartButton("Start browsing now");
    }

    @Test
    public void validTextCheckTest() {
        textPage.openPage()
                .setDropdownMenu()
                .setTextMenu()
                .verifyHeadingWrap("Planning a 2023 Miami");
    }


    @Test
    public void checkTextAppearsHoverTest() {
        textPage.openPage()
                .setDropdownToggle()
                .verifyDropdownList("Las Vegas, NV");
    }

    @Test
    public void textShouldChangeAfterClickingTest() {
        textPage.openPage()
                .setReviewSlide()
                .verifyNextReviewSlide("Such a cool app!");
    }

    @Test
    public void fullTextShouldAppearTest() {
        textPage.openPage()
                .setExploreLink()
                .writeTextInput("ca")
                .verifyAppearText("California");
    }
}