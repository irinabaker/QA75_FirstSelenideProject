Feature: Cart

  @item
  Scenario: Add item to the cart
    Given User is on HomePage
    When User clicks on Login icon
    And User enters correct data
    And User clicks on Anmelden button
    And User clicks on first category
    And User clicks in first item
    And User add item to cart
    Then User verifies item name by text
