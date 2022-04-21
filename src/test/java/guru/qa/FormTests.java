package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;

public class FormTests {

    @BeforeAll
    static void holdBrowser() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillForm() {
        Configuration.browserSize = "1920x1200";
        String name = "Mark";
        String sName = "Gubin";
        String eMail = "iphonesasuke@gmail.com";
        String nmbr = "9115513773";
        String img = "img/78316387_p0.jpg";
        String address = "Some address";

        open ("/automation-practice-form");
        $ ("#firstName").setValue(name);
        $ ("#lastName").setValue(sName);
        $ ("#userEmail").setValue(eMail);
        $(byText("Male")).click();
        $ ("#userNumber").setValue(nmbr);
        $ ("#dateOfBirthInput").click();
        $ (".react-datepicker__month-select").selectOption("July");
        $ (".react-datepicker__year-select").selectOption("1992");
        $("[aria-label$='Friday, July 31st, 1992']").click();
        $ ("#subjectsInput").setValue("Maths").pressEnter();
        $ (byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath(img); // заливка через Classpath
        $("input#uploadPicture").uploadFile(new File("src/test/resources/img/78316387_p0.jpg"));
        $("#currentAddress").setValue(address);
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Noida")).click();
        $("#submit").click();

//Asserts
        $(".table-responsive").shouldHave(text("Student Name " + name + " Gubin"),
                text("Student Email " + eMail),
                text("Gender" + " Male"),
                text("Mobile " + "9115513773"),
                text("Date of Birth" + " 31 July,1992"),
                text("Subjects Maths"),
                text("Hobbies Music"),
                text("State and City " + "NCR " + "Noida"),
                text("Address " + address),
                text("Address" + " Some address"),
                text("State and City NCR Noida"));
    }
}

