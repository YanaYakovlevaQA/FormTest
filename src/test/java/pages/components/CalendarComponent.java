package pages.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    SelenideElement createMonth = $(".react-datepicker__month-select"),
    createYear = $(".react-datepicker__year-select");

        public void setDate (String day, String month, String year) {
            createMonth.selectOption(month);
            createYear.selectOption(year);
            $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
        }
}
