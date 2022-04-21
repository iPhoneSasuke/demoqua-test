package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void dontClose() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void FillingBox (){
        Configuration.browserSize = "1920x1200";
        String name = "Mark Gubin";
        String em = "iphonesasuke@gmail.com";
        String adr1 = "Saint-P";
        String adr2 = "Petergof";

        open ("/text-box");
        $ ("[id=userName]").setValue(name);
        $ ("[id=userEmail]").setValue(em);
        $ ("[id=currentAddress]").setValue(adr1);
        $ ("[id=permanentAddress]").setValue(adr2);
        $ ("[id=submit]").click();

        //Asserts
        $ ("[id=output]").shouldHave(text(name), text("iphonesasuke@gmail.com"),
                text("Saint-P"), text("Petergof"));
        $ ("[id=output] [id=name]").shouldHave(text(name));
        $ ("[id=name]").shouldHave(text(name));

        $ ("[id=permanentAddress]").shouldHave(text("Petergof")); //wrong
        $ ("[id=permanentAddress]", 1).shouldHave(text("Petergof"));
        $ ("p[id=permanentAddress]", 1).shouldHave(text("Petergof"));
    }
}
