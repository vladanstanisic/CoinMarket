Feature: CoinMarketCap Frontend

  Background:
    Given I access the CoinMarketCap website

    Scenario: FE Test 1
    Then I should verify that 100 Cryptocurrencies are displayed.

    Scenario: FE Test 2
    When I select between 5 and 10 random Cryptocurrencies
    And For each click the ellipsis to select View Historical Data
    And change data range to display last 7 days
    Then Verify that Historical data for the last 7 days are displayed

  Scenario: FE Test 3
    When I mouseover on Cryptocurrencies tab.
    And I click on the Spotlight option on this menu
    And I record the data in Most visited category (10 coins)
    Then I open Most Visited link See More in new tab and Verify that first 10 Most Visited coins are also displayed in new tab