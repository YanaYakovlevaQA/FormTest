package pages;

import com.codeborne.selenide.SelenideElement;
import pages.Components.CalendarComponent;
import pages.Components.SubmitModalWindowComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    SubmitModalWindowComponent submitModalWindowComponent = new SubmitModalWindowComponent();

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            selectState = $("#react-select-3-input"),
            selectCity = $("#react-select-4-input"),
            submitButton = $("#submit");

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

    public RegistrationPage SetDateOfBirth (String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage SetSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
}

    public RegistrationPage SetHobbies(String value) {
        hobbiesInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage SetPicture(String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage SetAddress(String value) {
        addressInput.setValue(value);

        return this;
    }

    public RegistrationPage SetStateAndCity(String state, String city) {
        selectState.setValue(state).pressEnter();
        selectCity.setValue(city).pressEnter();

        return this;
    }

    public RegistrationPage SetSubmit() {
        submitButton.pressEnter();

        return this;
    }

    public RegistrationPage CheckSubmit(String key, String value) {
        submitModalWindowComponent.submitModal(key, value);

        return this;
    }

    public RegistrationPage negSubmit() {
        submitModalWindowComponent.negativeSubmit();

        return this;
    }

}