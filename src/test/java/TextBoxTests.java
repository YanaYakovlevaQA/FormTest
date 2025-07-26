import org.junit.jupiter.api.Test;
import pages.TextBoxTextPage;

public class TextBoxTests extends TestBase {
    TextBoxTextPage textBoxTextPage = new TextBoxTextPage();

    @Test
    void textBoxTests() {
        textBoxTextPage.openPage()
                .setFullName("Test Testov")
                .setEmail("test@test.com")
                .setAddress("Родонитовая 3/2")
                .setPermanentAddress("Russia")
                .sendSubmit();

        textBoxTextPage.checkResult("Test Testov")
                .checkResult("test@test.com")
                .checkResult("Родонитовая 3/2")
                .checkResult("Russia");

    }
}
