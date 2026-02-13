package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.CartPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.ItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ItemSteps {

    HomePage home;
    ItemPage item;
    CartPage cart;

    @And("User clicks on first category")
    public void click_on_category() {
        home = Selenide.page(HomePage.class);
        home.clickOnCategory();
    }

    @And("User clicks in first item")
    public void clicks_on_item() {
        item = Selenide.page(ItemPage.class);
        item.clickOnItem();
    }

    @And("User add item to cart")
    public void add_item_to_cart() {
        item.clickAddToCartButton();
        item.addPostIndex();
        item.clickZumWarencorb();
    }

    @Then("User verifies item name by text")
    public void verify_item_name_by_text() {
        cart = Selenide.page(CartPage.class);
        cart.verifyItemName();
    }
}
