import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormTestWithPageObject extends SetUp {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void formTestWithPageObject() {
        registrationPage.openPage();
        registrationPage.SetFirstName("Test");
        registrationPage.SetLastName("Testov");
        $("#userEmail").setValue("test@test.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9899499099");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day--029:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Physics").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/Photo.png");
        $("#currentAddress").setValue("Екатеринбург, Родонитовая, 5с1");
        $("#react-select-3-input").setValue("J").pressEnter();
        $("#react-select-4-input").setValue("J").pressEnter();
        $("#submit").pressEnter();

        //Проверка формы
        $(".table-responsive").shouldHave(text("Test Testov"));
        $(".table-responsive").shouldHave(text("test@test.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("9899499099"));
        $(".table-responsive").shouldHave(text("29 May,1996"));
        $(".table-responsive").shouldHave(text("Physics, Maths"));
        $(".table-responsive").shouldHave(text("Sports"));
        $(".table-responsive").shouldHave(text("Photo.png"));
        $(".table-responsive").shouldHave(text("Екатеринбург, Родонитовая, 5с1"));
        $(".table-responsive").shouldHave(text("Rajasthan Jaipur"));
    }
}
