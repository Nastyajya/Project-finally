package uitests;

import org.junit.jupiter.api.Test;
import uitests.pages.ElementPage;

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
                .setTextButton()
                .setDialogueButton()
                .setDialogWindow()

                .verifyBannerMessages();
    }
}
