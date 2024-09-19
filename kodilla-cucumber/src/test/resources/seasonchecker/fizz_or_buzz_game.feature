Feature: Fizz or Buzz game?

  Scenario Outline:Divide a number by 3 or and 5
    Given dividend number is <number>
    When can be number divide by three or and  five
    Then the result of division should be <result>
    Examples:
      | number   | result     |
      | three    | "Fizz"     |
      | five     | "Buzz"     |
      | fifteen  | "FizzBuzz" |
      | nineteen | "None"     |