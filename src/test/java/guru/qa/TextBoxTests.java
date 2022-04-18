package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @Test
    void FillingBox (){
        open("https://demoqa.com/text-box");
    }
}
