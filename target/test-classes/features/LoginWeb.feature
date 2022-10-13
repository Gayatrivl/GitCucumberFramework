#Author: gayatrivl@gmail.com

Feature: Login from website sauceDemo using (standard_user/secret_sauce)
 
  
  Scenario: Login 
    Given User is on saucedemo page
    When User logged in with username "standard_user" and password "secret_sauce"
    Then products page is displayed
  
 