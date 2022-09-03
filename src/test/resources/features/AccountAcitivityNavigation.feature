Feature: Navigation to specific accounts in Account Activity

  Background:
    Given the user is logged in

  @Sorin
  Scenario: Savings account redirect
    When the user click on Savings link on the Account Summary page
    And the Account Activity page should be displayed
    Then Account drop down should have Savings selected

    @Sorin1
    Scenario:Brokerage account redirect
      When user click on ONLINE BANKING
      And the user click on Account Summary
      And the user clicks on Brokerage link on the Account Summary page
      And the Account Activity page should be displayed
      Then Account drop down should have Brokerage selected

