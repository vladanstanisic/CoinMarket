Feature: CoinMarketCap -task3

  Scenario: Print 10 cryptocurrencies
    Given I send Api Key
    When I retrieve the first 10 currencies
    And I check which curencies have mineable tag associated with them
    Then I verify that the correct cryptocurrencies have been printed out