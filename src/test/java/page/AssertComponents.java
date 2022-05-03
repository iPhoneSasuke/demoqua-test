package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AssertComponents {

    SelenideElement submitPage = $("#example-modal-sizes-title-lg");
    SelenideElement checkPage = $(".table-responsive");

    public AssertComponents submitSuccessful(String value) {
        submitPage.shouldHave(text(value));
        return this;
    }
    public AssertComponents checkFirstName(String rName) {
        checkPage.shouldHave(text(rName));
        return this;
    }

    public AssertComponents checkLastName(String rLastName) {
        checkPage.shouldHave(text(rLastName));
        return this;
    }

    public AssertComponents checkEmail(String rEmail) {
        checkPage.shouldHave(text(rEmail));
        return this;
    }

    public AssertComponents checkPhone(String iPhone) {
        checkPage.shouldHave(text(iPhone));
        return this;
    }
    public AssertComponents checkAddress(String rAddress) {
        checkPage.shouldHave(text(rAddress));
        return this;
    }
}
