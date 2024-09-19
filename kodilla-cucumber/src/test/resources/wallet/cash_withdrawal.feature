Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Withdrawal fails when requested amount exceeds deposited funds
    Given I have deposited $20 in my wallet
    When  I request $21
    Then Dispens should be canceled-not enough money

  Scenario: Withdrawal fails when deposit is zero(balance equals zero)
    Given I have deposited $0 in my wallet
    When I request $100
    Then Dispens should be canceled-balance is zero

  Scenario: Withdraw exact balance leaves wallet empty
    Given I have deposited $125 in my wallet
    When I request $125
    Then $125 should be dispensed


