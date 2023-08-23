package uitests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import uitests.pages.ElementPage;

@Owner("A.Zelenskaia")
@Epic("UI")
public class ElementTests extends TestBase {
    ElementPage elementPage = new ElementPage();

    @Test
    public void checkShareButtonTest() {
        elementPage.openPage()
                .setContentCard()
                .setContentMain()

                .verifyShareButton();
    }

    @Test
    public void checkBannerMessagesTest() {
        elementPage.openPage()
                .setContentCard()
                .setDialogueButton()
                .setDialogWindow()

                .verifyBannerMessages();
    }
}
