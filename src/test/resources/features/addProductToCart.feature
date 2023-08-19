Feature: Checkout flow of application
 Scenario: Add product to cart
   Given User is already on Home Page
   When User add product to the cart
   And User verifies product added successfully

 Scenario: Checkout from the cart
   Given user go to cart
   Then user enter checkout information
   Then user finish and checkout
   And validate user checkout successfully
   Then close browser