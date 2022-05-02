package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.PageObjects;

import static com.codeborne.selenide.Selenide.open;

public class TestWithObjects {

    @BeforeAll
    static void holdBrowser() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1200";
    }

    @Test
    void fillForm() {
        String img = "img/78316387_p0.jpg";
        PageObjects pageObjects = new PageObjects();


        open("/automation-practice-form");

        pageObjects.setFirstName("Mark")
                .setSecondName("Gubin")
                .setEmail("iPhoneSasuke@gmail.com")
                .setGender("Male")
                .setPhone("9115513773")
                .setBirthDate("31", "July", "1992")
                .setSubjects("Maths")
                .setHobbies("Music")
                .setPick(img)
                .setAddress("Some address")
                .setAuthority("NCR", "Noida")
                .submit();
    }
}

