Feature: Handling zero deposits and withdrawals

  Scenario: Prevent from $0 deposits or withdrawals
    Given I have deposited $5 in my wallet
    When I have or withdrawal $0 from my wallet
    And I have deposited $0 in my wallet
    Then I should get message Select an amount higher than $0.