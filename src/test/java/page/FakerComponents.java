package page;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;

public class FakerComponents {
    Faker faker = new Faker();

    public String getName() {
        return faker.name().firstName();
    }
    public String getLastName() {
        return faker.name().lastName();
    }
    public String getEmail() {
        return faker.internet().emailAddress();
    }
    public String getPhoneNumb() {
        return faker.number().digits(10);
    }
    public String getAddress() {return faker.address().fullAddress(); }
}
