package page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PageObjects {

    //locators
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement eMailInput = $("#userEmail");
    SelenideElement phoneInput = $("#userNumber");
    SelenideElement genderInput = $("#genterWrapper");
    SelenideElement dateInput = $("#dateOfBirthInput");
    SelenideElement subjectsInput = $("#subjectsInput");
    SelenideElement hobbiesInput = $("#hobbiesWrapper");
    SelenideElement pickUP = $("#uploadPicture");
    SelenideElement addressInput = $("#currentAddress");
    SelenideElement submitInput = $("#submit");
    CalendarComponent calendar = new CalendarComponent();
    StateComponent stateComponent = new StateComponent();

    //actions
    public PageObjects setFirstName(String value) { //public %название класса% %название метода%
        firstNameInput.setValue(value);
        return this;
    }

    public PageObjects setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public PageObjects setEmail(String value) {
        eMailInput.setValue(value);
        return this;
    }

    public PageObjects setPhone(String value) {
        phoneInput.setValue(value);
        return this;
    }

    public PageObjects setGender(String value) {
        genderInput.$(byText(value)).click();
        return this;
    }

    public PageObjects setBirthDate(String day, String month, String year) {
        dateInput.click();
        calendar.setBirthDate(day, month, year);
        return this;
    }

    public PageObjects setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public PageObjects setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public PageObjects setPick(String img) {
        pickUP.uploadFromClasspath(img);
        return this;
    }

    public PageObjects setAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public PageObjects setAuthority(String state, String city) {
        stateComponent.setAuthority("", "");
        return this;
    }
    public PageObjects submit() {
        submitInput.click();
        return this;
    }

}
