Feature: Search functionality

  @smoke @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

  Examples:
  |    make    |  model   |  location       |    price         |
  | Porsche    |  911     |  NSW - Sydney   |  $100,000        |
  | BMW        | 2 Series | NSW - All       | 60000 |
  | Audi       | A3       | NSW - All       | 50000 |
  | Honda      | Civic    | NT - North      | 35000 |
  | Nissan     | Murano   | NSW - All       | 45000 |
  | Audi       | A1       | ACT - All       | 50000 |


    @sanity @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Used' link
    Then I navigate to 'Used cars for sale' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      |    make    |  model   |  location       |    price         |
      | Porsche    |  911     |  NSW - Sydney   |  $100,000        |
      | BMW        | 2 Series | NSW - All       | 60000            |
      | Audi       | A3       | NSW - All       | 50000            |
      | Honda      | Civic    | NT - North      | 35000            |
      | Nissan     | Murano   | NSW - All       | 45000            |
      | Audi       | A1       | ACT - All       | 50000            |

