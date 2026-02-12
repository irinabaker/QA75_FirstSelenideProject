package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage enterData(String email, String password) {
        $("#loginEmail").shouldBe(Condition.visible).val(email);
        $("#loginPassword").val(password);
        return Selenide.page(this);
    }

    public HomePage clickOnAnmelden() {
        $("#login-submit").click();
        return Selenide.page(HomePage.class);
    }
}
