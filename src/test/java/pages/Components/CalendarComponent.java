package pages.Components;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static java.util.function.Predicate.not;

public class CalendarComponent {
        public void setDate (String day, String month, String year) {
            $(".react-datepicker__month-select").selectOption(month);
            $(".react-datepicker__year-select").selectOption(year);
            $(".react-datepicker__day--0" + day).click();
        }
}
