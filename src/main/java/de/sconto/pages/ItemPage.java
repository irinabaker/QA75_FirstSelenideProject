package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {

    public static final String itemNumber = PropertiesLoader.loadProperty("item");
    public static final String zipCode = PropertiesLoader.loadProperty("zipcode");

    public ItemPage clickOnItem() {
        $("ul>li:nth-child(" + itemNumber + ")>article>a").shouldBe(Condition.visible).click();
        return Selenide.page(this);
    }

    public ItemPage clickAddToCartButton() {
        //executeJavaScript("window.scrollTo(0,document.body.scrollHeight)");
        $("[data-testid='addToCartButton']").shouldBe(Condition.visible).click();
        return Selenide.page(this);
    }

    public ItemPage addPostIndex() {
        if ($("#zipCode").exists()) {
            $("#zipCode").shouldBe(Condition.visible).val(zipCode);
            $("[data-testid='overlayContent'] div:nth-child(4) button").click();
        }
        return Selenide.page(this);
    }

    public CartPage clickZumWarencorb() {
        $("[data-testid='cartOverlayToCartButton']").shouldBe(Condition.visible).click();
        return Selenide.page(CartPage.class);
    }
}
