package guru.qa;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.FakerComponents;
import page.PageObjects;

import static com.codeborne.selenide.Selenide.open;

public class TestObjectsUndFaker {

    @BeforeAll
    static void holdBrowser() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1200";
    }

    @Test
    void fillForm() {
        open("/automation-practice-form");
        PageObjects pageObjects = new PageObjects();
        FakerComponents fakerComponents = new FakerComponents();

        String rName = fakerComponents.callName();
        String rLastName = fakerComponents.callLastName();
        String rEmail = fakerComponents.callEmail();
        String iPhone = fakerComponents.callPhoneNumb();
        String rAddress = fakerComponents.callAddress();
        String img = "img/78316387_p0.jpg";


        pageObjects.setFirstName(rName)
                .setLastName(rLastName)
                .setEmail(rEmail)
                .setGender("Male")
                .setPhone(iPhone)
                .setBirthDate("31", "July", "1992")
                .setSubjects("Maths")
                .setHobbies("Music")
                .setPick(img)
                .setAddress(rAddress)
                .setAuthority("NCR", "Noida")
                .submit();
    }
}

