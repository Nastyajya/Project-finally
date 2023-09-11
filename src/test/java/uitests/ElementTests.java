package uitests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import uitests.pages.DialogPage;

@Owner("A.Zelenskaia")
@Epic("UI")
public class ElementTests extends TestBase {
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
