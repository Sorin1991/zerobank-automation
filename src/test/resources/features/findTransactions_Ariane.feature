Feature: find transactions


  Background:
    Given user has logged in, gone on Checking Account Activity then on Find Transactions

  @Ariane
  Scenario:    Search by description word

    When the user enters description ONLINE
    And    clicks search
    Then results table should only show descriptions containing “ONLINE”

  @NotNow
  Scenario:
    When the	user	enters	description	“OFFICE”
    And    clicks	search
    Then results	table	should	only	show	descriptions	containing	“OFFICE”
    But results	table	should	not show	descriptions	containing	“OFFICE”