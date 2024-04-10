package Pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class CheckboxesPage {
    private final ElementsCollection checkboxes = $$("input[type='checkbox']");

    @Step("Клик по чекбоксу с индексом {index}")
    public void clickCheckbox(int index) {
        checkboxes.get(index).click();
    }

    @Step("Проверка, выбран ли чекбокс с индексом {index}")
    public boolean isCheckboxSelected(int index) {
        return checkboxes.get(index).isSelected();
    }
}
