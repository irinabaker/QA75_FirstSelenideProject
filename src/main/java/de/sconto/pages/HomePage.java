package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static final String baseURL = PropertiesLoader.loadProperty("url");
    public static final String categoryNumber = PropertiesLoader.loadProperty("category");

    public LoginPage clickOnLoginIcon() {
        $(".headerElement__icon--login").click();
        return Selenide.page(LoginPage.class);
    }

    private SelenideElement acceptAll = $("[data-accept-action='all']");

    public HomePage acceptCookies() {
        if ($(acceptAll).exists()){
            $(acceptAll).click();
        }
        return Selenide.page(this);
    }

    public ProfilePage clickOnUserStatus() {
        $(".headerElement__status--login").shouldBe(Condition.visible).click();
        return Selenide.page(ProfilePage.class);
    }

    public ItemPage clickOnCategory() {
        $(".section:nth-child(4) div:nth-child(3) a:nth-child(" + categoryNumber + ")")
                .shouldBe(Condition.visible).click();
        return Selenide.page(ItemPage.class);
    }
}
