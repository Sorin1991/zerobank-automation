
@cem
Feature: User can purchase foreign currency

  Scenario: User can see available foreign currencies

    Given user accesses the Purchase foreign currency cash tab
    When user clicks the dropdown to see the available currencies
    Then user see the below currency type available

  |Select One|
  |Australia (dollar)|
  |Canada (dollar)|
  |Switzerland (franc)|
  |China (yuan)|
  |Denmark (krone)|
  |Eurozone (euro)|
  |Great Britain (pound)|
  |Hong Kong (dollar)|
  |Japan (yen)|
  |Mexico (peso)|
  |Norway (krone)|
  |New Zealand (dollar)|
  |Sweden (krona)|
  |Singapore (dollar)|
  |Thailand (baht)|


  Scenario: User should receive an error message when trying to purchase foreign currency only entering the value, without selecting the currency

    Given user accesses the Purchase foreign currency cash tab
    When user enters the amount to be purchased
    And user click the purchase button
    Then user receives the message 'Please, ensure that you have filled all the required fields with valid values.'


  Scenario: User should receive an error message when trying to purchase foreign currency only selecting the currency, without entering the value

    Given user accesses the Purchase foreign currency cash tab
    When user selects the currency to be purchased
    And user click the purchase button
    Then user receives the message 'Please, ensure that you have filled all the required fields with valid values.'