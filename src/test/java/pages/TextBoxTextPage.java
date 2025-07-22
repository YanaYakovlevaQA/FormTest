package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTextPage {
    private SelenideElement fullName = $("#userName"),
            eMail = $("#userEmail"),
            address = $("#currentAddress"),
            permanentAdress = $("#permanentAddress"),
            submitButton = $("#submit");


    public TextBoxTextPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxTextPage setFullName(String value) {
        fullName.setValue(value);

        return this;
    }


    public TextBoxTextPage setEmail(String value) {
        eMail.setValue(value);

        return this;
    }

    public TextBoxTextPage setAddress(String value) {
        address.setValue(value);

        return this;
    }

    public TextBoxTextPage setPermanentAddress(String value) {
        permanentAdress.setValue(value);

        return this;
    }

    public TextBoxTextPage sendSubmit(){
        submitButton.click();

        return this;
    }

    public TextBoxTextPage checkResult (String value){
        $("#output").shouldHave(text(value));

        return this;
    }
}

