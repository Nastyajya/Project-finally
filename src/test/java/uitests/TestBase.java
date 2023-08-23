package uitests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import uitests.config.WebDriverConfig;
import uitests.config.WebDriverProvider;

import static com.codeborne.selenide.Selenide.closeWebDriver;



public class TestBase {

    @BeforeEach
    public void addLogger() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @BeforeAll
    static void configure() {
        WebDriverProvider.configuration();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.pageLoadStrategy = "eager";
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}