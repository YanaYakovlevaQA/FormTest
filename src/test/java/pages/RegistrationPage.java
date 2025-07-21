package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber");

    public RegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPage SetFirstName (String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage SetLastName (String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage SetUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage SetGenterWrapper(String value) {
        genterInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage SetUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }
}