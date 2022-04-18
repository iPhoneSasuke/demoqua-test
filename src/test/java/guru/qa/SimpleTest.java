package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB() {
        System.out.println("### @BeforeAll");
    }

    @BeforeEach
    void openGooglePage() {
        System.out.println("### @BeforeEach");
//        Selenide.open("https://www.google.ru/");
    }

    @AfterEach
    void closeGP() {
        System.out.println("### @AfterEach");
//        WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void cleanDB() {
        System.out.println("### @AfterAll");
    }

    @Test
    void assertTest0() {
        System.out.println("### Test 0");
         // ... панцу
    }
    @Test
    void assertTest1() {
        System.out.println("### Test 1");
        // ... Lake People
    }
}
