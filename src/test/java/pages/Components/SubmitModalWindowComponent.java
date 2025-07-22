package pages.Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SubmitModalWindowComponent {
    SelenideElement tableResponsive = $(".table-responsive"),
            lastNameInput = $("#lastName");

    public void submitModal (String key, String value) {
        tableResponsive.$(byText(key)).parent().shouldHave(text(value));
    }

    public void negativeSubmit() {
        lastNameInput.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }
}
