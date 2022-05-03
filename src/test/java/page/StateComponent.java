package page;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateComponent {
    public void setAuthority (String state, String city) {
        $("#stateCity-wrapper").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Noida")).click();
    }
}
