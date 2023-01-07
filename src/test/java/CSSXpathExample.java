import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CSSXpathExample {

    void cssXpathExample() {
        //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");

        //<input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("#email").setValue("1");
        $x("//*[@id=email]").setValue("1");

        //<input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        //<input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".login_form_input_box.inputtext").setValue("1");
        $("input.login_form_input_box.inputtext").setValue("1");

        /*
        *<div class="a">
            <input class="b">
        </div>
        */
        $(".a .b").setValue("1");
        $(".a").$(".b").setValue("1");

        //<div>Hello</div>
        $(byText("Hello"));
        $(withText("ell"));
    }
}
