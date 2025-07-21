import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FormTestWithPageObject extends SetUp {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void formTestWithPageObject() {
        registrationPage.openPage()
                .SetFirstName("Test")
                .SetLastName("Testov")
                .SetUserEmail("test@test.com")
                .SetGenterWrapper("Male")
                .SetUserNumber("9899499099")
                .SetDateOfBirth("15", "May", "1996")
                .SetSubjects("Physics")
                .SetSubjects("Maths")
                .SetHobbies("Sports")
                .SetPicture("img/Photo.png")
                .SetAddress("Екатеринбург, Родонитовая, 5с1")
                .SetStateAndCity("J", "J")
                .SetSubmit();

        //Проверка формы
        $(".table-responsive").shouldHave(text("Test Testov"));
        $(".table-responsive").shouldHave(text("test@test.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("9899499099"));
        $(".table-responsive").shouldHave(text("15 May,1996"));
        $(".table-responsive").shouldHave(text("Physics, Maths"));
        $(".table-responsive").shouldHave(text("Sports"));
        $(".table-responsive").shouldHave(text("Photo.png"));
        $(".table-responsive").shouldHave(text("Екатеринбург, Родонитовая, 5с1"));
        $(".table-responsive").shouldHave(text("Rajasthan Jaipur"));
    }
}
