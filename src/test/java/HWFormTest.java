import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HWFormTest {
    @Test
    void formTest() {
        Configuration.browserSize = "1980x1080";
//        Configuration.holdBrowserOpen = true;

        String surname = "Ivanov";
        String email = "IIvanov@mail.ru";

        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");//удаляет рекламу
        executeJavaScript("$('footer').remove()");//удаляет footer
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue(surname);
        $("#userEmail").setValue(email);
//        $("#gender-radio-1").click();
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("2023");
        $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();

//        $("#uploadPicture").uploadFile(new File("D:/tracert.txt"));
        $("#uploadPicture").uploadFromClasspath("1.txt");

        $("#currentAddress").setValue("SPb");
        $("#state").click();
        $(byTagAndText("div", "Haryana")).click();
        $("#city").click();
        $(byTagAndText("div", "Karnal")).click();

        $("#submit").click();

        $(".modal-content").should(appear);
        $(".table-responsive").shouldHave(text(surname), text(email));

    }
}
