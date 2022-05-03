package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.AssertComponents;
import page.FakerComponents;
import page.PageObjects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestObjectsUndFaker {

    PageObjects pageObjects = new PageObjects();
    FakerComponents fakerComponents = new FakerComponents();
    AssertComponents assertComponents = new AssertComponents();

    @BeforeAll
    static void holdBrowser() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1200";
    }

    @Test
    void fillForm() {
        open("/automation-practice-form");

        //Hint: "r" means shorted "random"
        String rName = fakerComponents.getName();
        String rLastName = fakerComponents.getLastName();
        String rEmail = fakerComponents.getEmail();
        String iPhone = fakerComponents.getPhoneNumb();
        String rAddress = fakerComponents.getAddress();
        String gender = "Male";
        String subjects = "Maths";
        String hobbies = "Music";
        String img = "img/78316387_p0.jpg";
        String success = "Thanks for submitting the form";

        pageObjects.setFirstName(rName)
                .setLastName(rLastName)
                .setEmail(rEmail)
                .setGender(gender)
                .setPhone(iPhone)
                .setBirthDate("31", "July", "1992")
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setPick(img)
                .setAddress(rAddress)
                .setAuthority("NCR", "Noida")
                .submit();

        //Asserts
        assertComponents.submitSuccessful(success)
                        .checkFirstName(rName)
                        .checkLastName(rLastName)
                        .checkEmail(rEmail)
                        .checkPhone(iPhone)
                        .checkAddress(rAddress);
    }
}
