package uk.co.amazon.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import uk.co.amazon.pages.BookPage;

public class BookPageTest {
    @And("^I click on The Bitcoin Standard – The Decentralized Alternative to Central Banking in list$")
    public void iClickOnTheBitcoinStandardTheDecentralizedAlternativeToCentralBankingInList() throws InterruptedException {
        new BookPage().clickOnBookLink();
        Thread.sleep(5000);
    }

    @Then("^I check the price of the book$")
    public void iCheckThePriceOfTheBook() throws InterruptedException {
        new BookPage().hardCoverPrice();
        Thread.sleep(5000);
    }

    @And("^I check the review count$")
    public void iCheckTheReviewCount() throws InterruptedException {
        new BookPage().reviewCount();
    }
}
