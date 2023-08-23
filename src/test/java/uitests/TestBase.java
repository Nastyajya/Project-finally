package uitests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import uitests.config.WebDriverProvider;
import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;


public class TestBase {

    @BeforeEach
    public void addLogger() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @BeforeAll
    static void configure() {
        WebDriverProvider.configuration();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

       DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        Configuration.pageLoadStrategy = "eager";
    }
    @AfterEach
    void addAttachments() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Attach.screenshotAs("Last screenshot");
        attachment("Source", webdriver().driver().source());
    }
    @AfterEach
    void closeWebDriver() {
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}