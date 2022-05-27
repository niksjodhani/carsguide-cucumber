Feature: Search functionality
  As user I want to search into carsguide website

  @Sanity@Regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Search Cars' link
    Then I navigate to 'new and used car search' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model           | location           | price   |
      | Tesla         | Model 3         | NSW - All          | $90,000 |
      | Audi          | A1              | ACT - All          | $80,000 |
      | Land Rover    | Discovery Sport | NSW - Central West | $90,000 |
      | Mercedes-Benz | A-Class         | NT - All           | $70,000 |
      | Suzuki        | Baleno          | NT - All           | $50,000 |
      | Tata          | Xenon           | Any Location       | $90,000 |

  @Regression@Smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Used' link
    Then I navigate to 'Used Cars For Sale' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model           | location           | price   |
      | Tesla         | Model 3         | NSW - All          | $90,000 |
      | Audi          | A1              | ACT - All          | $1,000  |
      | Land Rover    | Discovery Sport | NSW - Central West | $90,000 |
      | Mercedes-Benz | A-Class         | NT - All           | $70,000 |
      | Suzuki        | Baleno          | NT - All           | $50,000 |
      | Tata          | Xenon           | Any Location       | $90,000 |


