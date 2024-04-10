package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {
    private final SelenideElement dropdownElement = $("#dropdown");

    @Step("Выбор опции по индексу: {index}")
    public void selectOptionByIndex(int index) {
        dropdownElement.selectOption(index);
    }

    @Step("Получение текста выбранной опции")
    public String getSelectedOptionText() {
        return dropdownElement.getSelectedOption().getText();
    }
}
