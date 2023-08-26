package uitests.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.local.properties"
})
    public interface WebDriverConfig extends Config {
        @Key("baseUrl")
        @DefaultValue("https://www.thebach.com/")
        String getBaseUrl();

        @Key("browser")
        @DefaultValue("CHROME")
        String getBrowser();

        @Key("browserVersion")
        @DefaultValue("100.0")
        String getBrowserVersion();

        @Key("browserSize")
        @DefaultValue("114.0")
        String getBrowserSize();

        @Key("remoteUrl")
        @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
        String getRemoteURL();
    }


