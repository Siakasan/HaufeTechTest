Feature: Purchase Products

  As a user on the website
  I want to be able to be able to select different products
  So i can proceed to checkout
  So i'm able to make purchase

  Scenario: Purchase Products
    Given I navigates to the website
    When I click on add to cart broccoli
    And I click on plus button to add extra cucumber
    And I click on add to cart cucumber
    And I click on plus button to add extra tomato
    And I click on add to cart tomatoes
    And I click on cart button
    And I click on proceed to checkout
    And I click on place order button
    And I select country
    And I tick on agree to term and conditions
    And I click on proceed button
    Then A success message is displayed