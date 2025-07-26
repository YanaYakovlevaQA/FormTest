import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class FormTestWithTestData extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void formTestWithPageObject() {
        registrationPage.openPage()
                .SetFirstName(TestData.firstName)
                .SetLastName(TestData.lastName)
                .SetUserEmail(TestData.userEmail)
                .SetGenterWrapper(TestData.gender)
                .SetUserNumber(TestData.phoneNumber)
                .SetDateOfBirth(TestData.day, TestData.month, TestData.year)
                .SetSubjects(TestData.subjects)
                .SetSubjects(TestData.subjects1)
                .SetHobbies(TestData.hobbies)
                .SetPicture(TestData.picture)
                .SetAddress(TestData.address)
                .SetStateAndCity(TestData.selectState, TestData.city)
                .SetSubmit();

        registrationPage.CheckSubmit("Student Name", TestData.firstName + " " + TestData.lastName)
                .CheckSubmit("Student Email", TestData.userEmail)
                .CheckSubmit("Gender", TestData.gender)
                .CheckSubmit("Mobile", TestData.phoneNumber)
                .CheckSubmit("Date of Birth", TestData.day + " " + TestData.month + "," + TestData.year)
                .CheckSubmit("Subjects", TestData.subjects + "," + " " + TestData.subjects1)
                .CheckSubmit("Hobbies", TestData.hobbies)
                .CheckSubmit("Picture", TestData.picture)
                .CheckSubmit("Address", TestData.address)
                .CheckSubmit("State and City",TestData.selectState + " " + TestData.city);
    }
}
