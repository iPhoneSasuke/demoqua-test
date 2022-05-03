package page;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;

public class FakerComponents {
    Faker faker = new Faker();

    public String callName() {
        return faker.name().firstName();
    }
    public String callLastName() {
        return faker.name().lastName();
    }
    public String callEmail() {
        return faker.internet().emailAddress();
    }
    public String callPhoneNumb() {
        return faker.number().digits(10);
    }
    public String callAddress() {return faker.address().fullAddress(); }
}
