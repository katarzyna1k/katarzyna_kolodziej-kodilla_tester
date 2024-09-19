Feature: Is it Summer? Everybody likes Summer

  Scenario Outline: Today is od isn't Summer
    Given today is <day>
    When I ask whether it's Summer
    Then I should be told <answer>
    Examples:
      | day                   | answer         |
      | last day of December  | "Nope"         |
      | second day of January | "Nope"         |
      | 10th day of February  | "Nope"         |
      | 5th day of May        | "Nope"         |
      | 20th day of June      | "Nope"         |
      | 21th day of June      | "Yes! Summer!" |
      | first day of August   | "Yes! Summer!" |
      | 23th day of August    | "Yes! Summer!" |
      | 24th day of September | "Nope"         |
