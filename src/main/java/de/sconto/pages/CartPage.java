package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public static final String itemName = PropertiesLoader.loadProperty("item.name");

    public SelenideElement verifyItemName() {
        return $(".cartEntry__articleLink span").shouldHave(text(itemName));
    }
}
