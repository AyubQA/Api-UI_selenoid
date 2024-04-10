package PageAssert;

import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.AbstractAssert;

public class PageAssert extends AbstractAssert<PageAssert, SelenideElement> {

    public PageAssert(SelenideElement actual) {
        super(actual, PageAssert.class);
    }

    public static PageAssert assertThat(SelenideElement actual) {
        return new PageAssert(actual);
    }

    public PageAssert isVisible() {
        isNotNull();

        if (!actual.isDisplayed()) {
            failWithMessage("Expected element to be visible, but it was not");
        }

        return this;
    }

    public PageAssert hasText(String expectedText) {
        isNotNull();

        String actualText = actual.text();
        if (!actualText.equals(expectedText)) {
            failWithMessage("Expected element's text to be <%s> but was <%s>", expectedText, actualText);
        }

        return this;
    }
}
