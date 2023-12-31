package uitests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import uitests.pages.CitiesPage;
import uitests.pages.DropdownPage;

@Owner("A.Zelenskaia")
@Epic("UI")
public class TextTests extends TestBase {
    DropdownPage dropdownPage = new DropdownPage();
    CitiesPage citiesPage = new CitiesPage();

    @Test
    public void textCheckButtonTest() {
        mainPage.openPage()
                .verifyStartButton("Start browsing now");
    }

    @Test
    public void validTextCheckTest() {
        mainPage.openPage()
                .setDropdownMenu();
        dropdownPage.setTextMenu();
        partyPage.verifyHeadingWrap("Planning a 2023 Miami");
    }


    @Test
    public void checkTextAppearsHoverTest() {
        mainPage.openPage()
                .setDropdownToggle()
                .verifyDropdownList("Las Vegas, NV");
    }

    @Test
    public void textShouldChangeAfterClickingTest() {
        mainPage.openPage()
                .setReviewSlide()
                .verifyNextReviewSlide("Such a cool app!");
    }

    @Test
    public void fullTextShouldAppearTest() {
        mainPage.openPage()
                .setExploreLink();
        citiesPage.writeTextInput("ca");
        dropdownPage.verifyAppearText("California");
    }
}