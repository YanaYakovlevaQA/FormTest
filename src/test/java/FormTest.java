import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @BeforeAll
    static void BeforeAll () {
        Configuration.browserSize = "1920x1980";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
        $("#userEmail").setValue("test@test.com");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("+79999999999");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();

        $(".react-datepicker__month-select").setValue("Another street 1");
        $("#dateOfBirthInput").click();
        $("#output").$("#name").shouldHave(text("Yana"));
        $("#output #email").shouldHave(text("yana@gmail.com"));
        $("#currentAddress", 1).shouldHave(text("Some street 1"));
        $("#output").$("#permanentAddress").shouldHave(text("Another street 1"));
    }
}
