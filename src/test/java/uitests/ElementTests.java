package uitests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import uitests.pages.DialogPage;
import uitests.pages.MainPage;
import uitests.pages.PartyPage;

@Owner("A.Zelenskaia")
@Epic("UI")
public class ElementTests extends TestBase {
    MainPage mainPage = new MainPage();
    PartyPage partyPage = new PartyPage();
    DialogPage dialogPage = new DialogPage();

    @Test
    public void checkShareButtonTest() {
        mainPage.openPage()
                .setContentCard();
        partyPage.setContentMain()
                .verifyShareButton();
    }

    @Test
    public void checkBannerMessagesTest() {
        mainPage.openPage()
                .setContentCard();
        partyPage.setDialogueButton();
        dialogPage.setDialogWindow()
                .verifyBannerMessages();
    }
}
