import Pages.CheckboxesPage;
import Driver.SetUpsForTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckboxesTest extends SetUpsForTests {
    private CheckboxesPage checkboxesPage;

    @BeforeEach
    public void setUp() {
        open("/checkboxes");
        checkboxesPage = new CheckboxesPage();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void testCheckboxes(int index) {
        // Проверяем начальное состояние чекбокса
        boolean initialState = checkboxesPage.isCheckboxSelected(index);

        // Нажимаем на чекбокс
        checkboxesPage.clickCheckbox(index);

        // Проверяем, что состояние чекбокса изменилось
        if (initialState) {
            assertThat(checkboxesPage.isCheckboxSelected(index))
                    .as("Чекбокс с индексом " + index + " должен был быть снят, но остался выбранным.")
                    .isFalse();
        } else {
            assertThat(checkboxesPage.isCheckboxSelected(index))
                    .as("Чекбокс с индексом " + index + " должен был быть выбран, но остался не выбранным.")
                    .isTrue();
        }
    }
}
