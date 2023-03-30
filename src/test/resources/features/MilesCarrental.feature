Feature: MileCarrental Page

  Scenario Outline: Reserve a car
    Given user enters mileCarrental site
    And user find Location "<Location>" Airport "<Airport>"
    And select pick up and drop off
    When user click search
    And select second card
    Then user can complete driver information
    And user click next
    Examples:
      | Location | Airport       |
      | Florida  | Keys Marathon |