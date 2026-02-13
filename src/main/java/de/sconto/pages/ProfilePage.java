package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private final static String userName = PropertiesLoader.loadProperty("user.name");

    public SelenideElement verifyUserName() {
        return $(".titleHeadline").shouldHave(text(userName));
    }
}
