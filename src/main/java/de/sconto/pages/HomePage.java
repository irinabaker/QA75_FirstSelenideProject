package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public LoginPage clickOnLoginIcon() {
        $(".headerElement__icon--login").click();
        return Selenide.page(LoginPage.class);
    }

    @FindBy(css = "[data-accept-action='all']")
    WebElement acceptAll;

    public HomePage acceptCookies() {
        if ($(acceptAll).exists()){
            $(acceptAll).click();
        }
        return Selenide.page(this);
    }
}
