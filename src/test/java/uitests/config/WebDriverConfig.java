package uitests.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.properties"
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
        String getBrowserSize();

        @Key("remoteUrl")
        String getRemoteURL();
    }


