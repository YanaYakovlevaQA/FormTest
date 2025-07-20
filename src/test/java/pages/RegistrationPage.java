package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    public static SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");

    public void openPage() {
        open("/automation-practice-form");
    }

    public void SetFirstName (String value) {
        firstNameInput.setValue(value);
    }

    public void SetLastName (String value) {
        lastNameInput.setValue(value);
    }

}