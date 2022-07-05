Feature: CoinMarketCap -test2

  Scenario: Retrieve the Ethereum technical documentacion website
    Given I send Api Key
    When I retrieve the Ethereum technical documentacion
    Then I confirm that the following logo URL "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png" is present
    Then I confirm that the technical_doc URL "https://github.com/ethereum/wiki/wiki/White-Paper" is present
    Then I confirm that the symbol of the currency is ETH:
    Then I confirm that the date added is "2015-08-07T00:00:00.000Z"
    Then I confirm that the platform is null
    Then I confirm that the currency has the mineable tag associated with it
