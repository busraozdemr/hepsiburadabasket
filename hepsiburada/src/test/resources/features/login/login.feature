@login
Feature: Login Scenarios

  Background:
    Given User open the Homepage
    And User hover the Login Button at the HomePage
    And User click the Login Button at the Homepage

  @successLogin
  Scenario: Login - Success
    And User type login info at the Login Page
      | username                | password |
      | busraozdmr.80@gmail.com | B.c.1993 |
    Then User should have login text as "Hesabım" at the HomePage

    ###################################################################################################################

  @failLogin
  Scenario Outline: Login - Fail
    And User type login info at the Login Page
      | username   | password   |
      | <username> | <password> |
  #  Then User should have error message "Hatalı giriş işlemleri yapıldı" at the Login Page

    Examples:
      | username                 | password |
      | invalid                  | B.c.1993 |
      | busraozdmr.80@gmail.com  | invalid  |
      | invalid                  | invalid  |
      | busraozdmr.80gmail.com   | B.c.1993 |
      | busraozdmr.<80@gmail.com | B.c.1993 |