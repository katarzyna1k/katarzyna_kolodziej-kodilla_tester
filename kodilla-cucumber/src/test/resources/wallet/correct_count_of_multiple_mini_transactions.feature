Feature: Correct count of multiple mini transaction

  Scenario: Successful count of in and out transactions
    Given I have $0 in my wallet
    When I have deposited $23 in my wallet
    And I have withdrawal $10 from my wallet
    And I have deposited $190 in my wallet
    And I have withdrawal $150 from my wallet
    And I have deposited $25 in my wallet
    Then The balance of my wallet should be $78

