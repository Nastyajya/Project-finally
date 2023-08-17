import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.thebach.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "100";
        //Configuration.remote = "false";
    }
   @AfterEach
     void afterEach(){
        Selenide.closeWebDriver();
    }
}
