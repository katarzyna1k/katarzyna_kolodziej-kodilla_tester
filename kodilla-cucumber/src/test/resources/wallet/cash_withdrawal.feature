Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Withdrawal fails when requested amount exceeds deposited funds
    Given I have deposited $20 in my wallet
    When  I request $21
    Then Dispens should be canceled-not enough money

  Scenario: Withdraw exact balance leaves wallet empty
    Given I have deposited $125 in my wallet
    When I request $125
    Then $125 should be dispensed


