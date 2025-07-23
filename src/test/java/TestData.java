import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestData {
    public static Faker faker = new Faker(new Locale("en-GB"));
    public static Date DateOfBirthday = faker.date().birthday();

    public static String firstName = faker.name().firstName(),
                         lastName = faker.name().lastName(),
                         userEmail = faker.internet().emailAddress(),
                         gender = faker.options().option("Male", "Female", "Other"),
                         phoneNumber = faker.phoneNumber().subscriberNumber(10),
                         day = String.valueOf(faker.random().nextInt(10, 27)),
                         month = (new SimpleDateFormat("MMMM", Locale.ENGLISH).format(DateOfBirthday)),
                         year = String.valueOf(faker.random().nextInt(1992, 2012)),
                         subjects = faker.options().option( "Maths", "English", "Physics", "Chemistry",
                                 "Computer Science", "Economics"),
                         subjects1 = faker.options().option( "Social Studies", "History", "Civics",
                    "Commerce", "Biology"),
                         hobbies = faker.options().option("Reading", "Sports", "Music"),
                         picture = "PhotoToo.png";
    }
