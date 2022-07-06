package uk.co.amazon.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.amazon.pages.HomePage;

public class HomePageTest {
    @Given("^I am on Amazon Home Page$")
    public void iAmOnAmazonHomePage() {
    }

    @And("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().clickOnAcceptCookies();
    }


    @When("^I click on search in dropdown$")
    public void iClickOnSearchInDropdown() {
        new HomePage().clickOnsearchDropdown();
    }

    @And("^I select \"([^\"]*)\" from the Drop down Menu$")
    public void iSelectFromTheDropDownMenu(String books)  {
        new HomePage().selectBooks(books);
    }

    @And("^I Search \"([^\"]*)\" in the search bar$")
    public void iSearchInTheSearchBar(String searchText) {
        new HomePage().enterBitcoinInsearchBox(searchText);
        new HomePage().clickOnSearchButton();
    }

   /* @And("^I see the books in list$")
    public void iSeeTheBooksInList() {
        new HomePage().findbook();
        //new HomePage().getAuthorNameText();

    }*/

    @And("^I see the The Bitcoin Standard – The Decentralized Alternative to Central Banking in list$")
    public void iSeeTheTheBitcoinStandardTheDecentralizedAlternativeToCentralBankingInList() {
        new HomePage().findbook();
    }

    @Then("^I check the Author Name \"([^\"]*)\"$")
    public void iCheckTheAuthorName(String authorName)  {
        String expected = authorName;
        String actual = new HomePage().getAuthorname();
        Assert.assertEquals("Author not found" , expected , actual);
    }

    @And("^I check the release date \"([^\"]*)\"$")
    public void iCheckTheReleaseDate(String releaseDate)  {
        String expectedDate = releaseDate;
        String actualDate = new HomePage().getReleaseDate();
        Assert.assertEquals("release date not found" , expectedDate , actualDate);
    }
}
