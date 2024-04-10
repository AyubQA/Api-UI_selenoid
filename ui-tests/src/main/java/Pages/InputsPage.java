package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class InputsPage {
    private final SelenideElement inputField = $("input[type='number']");

    @Step("Ввод числа {number} в поле ввода")
    public void enterNumber(int number) {
        inputField.clear();
        inputField.sendKeys(String.valueOf(number));
    }

    @Step("Ввод текста {text} в поле ввода")
    public void enterText(String text) {
        inputField.clear();
        inputField.sendKeys(text);
    }

    @Step("Получение значения из поля ввода")
    public String getInputValue() {
        return inputField.getAttribute("value");
    }
}
