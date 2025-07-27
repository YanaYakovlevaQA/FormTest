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
            subjects = faker.options().option("Maths", "English", "Physics", "Chemistry",
                    "Computer Science", "Economics"),
            subjects1 = faker.options().option("Social Studies", "History", "Civics",
                    "Commerce", "Biology"),
            hobbies = faker.options().option("Reading", "Sports", "Music"),
            picture = "PhotoToo.png",
            address = faker.address().fullAddress(),
            selectState = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = selectCity(selectState);


    public static String selectCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };

    }
}
