
Feature: CoinMarket - test1

  Scenario: Convert currencies to Bolivian Boliviano
    Given I send key
    When I retreve ID of symbol
    Then Convert them to Bolivian Boliviano


#    Scenario Outline: Convert currencies to Bolivian Boliviano
#      Given I send key
#      When I retreve ID of "<symbol>"
#      Then Convert them to Bolivian Boliviano
#      Examples:
#        | symbol  |
#        | BTC |
#        | USDT |
#        | ETH |