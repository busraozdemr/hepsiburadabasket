@basket
Feature: Basket Scenarios

  @basket @basketLogin
  Scenario: Basket - Basket with Login
    Given User open the Homepage
    And User hover the Login Button at the HomePage
    And User click the Login Button at the Homepage
    And User type login info at the Login Page
      | username                | password |
      | busraozdmr.80@gmail.com | B.c.1993 |
    Then User should have login text as "Hesabım" at the HomePage
    And User search with "ev terliği" at the HomePage
    And User click random product at the Search Page
    And User open the product detail page at the Product Detail Page
    And User get product info at the Product Detail Page
    And User click add to basket at the Product Detail Page
    And User click keep shopping button at the Product Detail Page
    And User click second random product at the Search Page
    And User get second product detail info at the Search Page
    And User click add to basket at the Product Detail Page
    And User click my basket button at the Product Detail Page
    Then User should have two product at the My Basket Page

    ###################################################################################################################

  @basket @basketWithoutLogin
  Scenario: Basket - Basket without Login
    Given User open the Homepage
    And User search with "ev terliği" at the HomePage
    And User click random product at the Search Page
    And User open the product detail page at the Product Detail Page
    And User get product info at the Product Detail Page
    And User click add to basket at the Product Detail Page
    And User click keep shopping button at the Product Detail Page
    And User click second random product at the Search Page
    And User get second product detail info at the Search Page
    And User click add to basket at the Product Detail Page
    And User click my basket button without login at the Product Detail Page
    Then User should have two product at the My Basket Page
