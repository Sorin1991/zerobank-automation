Feature: Zerobank login feature

@cem
Scenario: User should login with valid credentials

When User is on the login-page
And User enters the username and password
Then User lands on the dashboard