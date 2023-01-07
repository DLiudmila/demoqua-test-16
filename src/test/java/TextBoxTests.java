import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen=true;
        Configuration.browserSize="1980x1080";
    }

    @Test
    void fillFormTest() {
        String userName = "Ljudmila";//можно задать переменную

        open("https://demoqa.com/text-box");

        $("#userName").setValue(userName);
        $("#userEmail").setValue("verliebtin@mail.ru");
        $("#currentAddress").setValue("Sankt-Petersburg");
        $("#permanentAddress").setValue("Vologda");
        $("#submit").click();
        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text("verliebtin@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Sankt-Petersburg"));
        $("#output #permanentAddress").shouldHave(text("Vologda"));
    }
}
