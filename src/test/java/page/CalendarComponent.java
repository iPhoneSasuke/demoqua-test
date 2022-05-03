package page;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setBirthDate (String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1992");
        $("[aria-label$='Friday, July 31st, 1992']").click();
    }
}
