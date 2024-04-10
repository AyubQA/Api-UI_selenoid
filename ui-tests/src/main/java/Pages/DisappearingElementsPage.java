package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class DisappearingElementsPage {

    private final ElementsCollection elements = $$("ul li a");

    @Step("Получение списка элементов")
    public ElementsCollection getElements() {
        return elements;
    }

    @Step("Получение элемента с индексом {index}")
    public SelenideElement getElement(int index) {
        return getElements().get(index);
    }

    @Step("Получение текста элемента с индексом {index}")
    public String getElementText(int index) {
        return getElement(index).getText();
    }

    @Step("Обновление страницы")
    public void refreshPage() {
        refresh();
    }
}
