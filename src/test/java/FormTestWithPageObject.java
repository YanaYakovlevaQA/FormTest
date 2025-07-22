import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

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

        registrationPage.CheckSubmit("Student Name", "Test Testov")
                .CheckSubmit("Student Email", "test@test.com" )
                .CheckSubmit("Gender","Male" )
                .CheckSubmit("Mobile", "9899499099")
                .CheckSubmit("Date of Birth", "15 May,1996" )
                .CheckSubmit("Subjects","Physics, Maths")
                .CheckSubmit("Hobbies", "Sports")
                .CheckSubmit("Picture","Photo.png")
                .CheckSubmit("Address","Екатеринбург, Родонитовая, 5с1")
                .CheckSubmit("State and City","Rajasthan Jaipur");

    }

    @Test
    void sucsessFormTestMin() {
        registrationPage.openPage()
                .SetFirstName("Test")
                .SetLastName("Testov")
                .SetGenterWrapper("Male")
                .SetUserNumber("9899499099")
                .SetDateOfBirth("15", "May", "1996")
                .SetSubmit();

        registrationPage.CheckSubmit("Student Name", "Test Testov")
                .CheckSubmit("Gender","Male" )
                .CheckSubmit("Mobile", "9899499099")
                .CheckSubmit("Date of Birth", "15 May,1996" );

    }

    @Test
    void negativeFormTestMin() {
        registrationPage.openPage()
                .SetFirstName("Test")
                .SetLastName("")
                .SetGenterWrapper("Male")
                .SetUserNumber("9899499099")
                .SetDateOfBirth("15", "May", "1996")
                .SetSubmit();

        registrationPage.negSubmit();
    }
}
