Feature: Navigation to specific accounts in Account Activity

  @Sorin
  Scenario: Savings account redirect
    Given the user is logged in
    When the user click on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Savings selected

    Scenario:Brokerage account redirect
      Given the user is logged in
      When the user clicks on Brokerage link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have Brokerage selected

