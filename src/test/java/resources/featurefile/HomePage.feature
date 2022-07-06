Feature:Home Page Test
  As a User , I want to explore Amazon Website

  Background:
    Given I am on Amazon Home Page
    And I accept cookies

  Scenario: I want to select a book from Amazon Website
    When I click on search in dropdown
    And I select "Books" from the Drop down Menu
    And I Search "Bitcoin" in the search bar
    And I see the The Bitcoin Standard – The Decentralized Alternative to Central Banking in list
    Then I check the Author Name "Saifedean Ammous"
    And I check the release date "8 Jun 2018"

    Scenario: I want to check price and review count
      When I click on search in dropdown
      And I select "Books" from the Drop down Menu
      And I Search "Bitcoin" in the search bar
      And  I click on The Bitcoin Standard – The Decentralized Alternative to Central Banking in list
     Then I check the price of the book
     And I check the review count

