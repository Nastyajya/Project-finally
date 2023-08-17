package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.thebach.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "100";
        SelenideLogger.addListener("allure", new AllureSelenide());
        //Configuration.remote = "false";
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

