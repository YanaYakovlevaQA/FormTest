import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @BeforeAll
    static void setUp () {
        Configuration.browserSize = "1920x1980";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        // Configuration.holdBrowserOpen = true; конфигурация для проверки теста
    }

    @Test
    void formTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
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
