package Driver;

import config.AppConfig;

import org.aeonbits.owner.ConfigFactory;
import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SetUpsForTests {

    private static final AppConfig config = ConfigFactory.create(AppConfig.class);

    @BeforeAll
    public void setUpClass() {
        Configuration.browser = "chrome";
        open("https://the-internet.herokuapp.com/");
        getWebDriver().manage().window().maximize();
        Configuration.baseUrl = config.baseUrl();
    }

    @AfterAll
    public void tearDownClass() {
        closeWebDriver();
    }
}
