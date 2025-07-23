import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class FormTestWithTestData extends SetUp {

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
                .SetSubjects("Physics")
                .SetSubjects("Maths")
                .SetHobbies("Sports")
                .SetPicture("img/Photo.png")
                .SetAddress("Екатеринбург, Родонитовая, 5с1")
                .SetStateAndCity("J", "J")
                .SetSubmit();

        registrationPage.CheckSubmit("Student Name", TestData.firstName + " " + TestData.lastName)
                .CheckSubmit("Student Email", TestData.userEmail)
                .CheckSubmit("Gender", TestData.gender)
                .CheckSubmit("Mobile", TestData.phoneNumber)
                .CheckSubmit("Date of Birth", TestData.day + " " + TestData.month + "," + TestData.year)
                .CheckSubmit("Subjects","Physics, Maths")
                .CheckSubmit("Hobbies", "Sports")
                .CheckSubmit("Picture","Photo.png")
                .CheckSubmit("Address","Екатеринбург, Родонитовая, 5с1")
                .CheckSubmit("State and City","Rajasthan Jaipur");

    }
}
