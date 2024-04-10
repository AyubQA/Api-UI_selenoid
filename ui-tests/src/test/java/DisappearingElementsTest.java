import Pages.DisappearingElementsPage;
import Driver.SetUpsForTests;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class DisappearingElementsTest extends SetUpsForTests {
    private DisappearingElementsPage disappearingElementsPage;

    @BeforeEach
    public void setUp() {
        open("https://the-internet.herokuapp.com/disappearing_elements");
        disappearingElementsPage = new DisappearingElementsPage();
    }

    @RepeatedTest(10)
    @Description("Проверка исчезающих элементов")
    public void testDisappearingElements(TestInfo testInfo) {
        System.out.println("Попытка номер: " + testInfo.getDisplayName());
        List<String> elementsTexts = disappearingElementsPage.getElements().texts();

        // Используем AssertJ для проверки количества элементов
        assertThat(elementsTexts).as("Количество элементов на странице не соответствует ожидаемому")
                .hasSize(5);

        // Используем AssertJ для проверки наличия элемента 'Gallery'
        assertThat(elementsTexts.contains("Gallery"))
                .as("Элемент 'Gallery' не найден")
                .isTrue();
    }
}
