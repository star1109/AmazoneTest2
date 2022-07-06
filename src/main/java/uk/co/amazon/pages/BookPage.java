package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.utility.Utility;

public class BookPage extends Utility {
    private static final Logger log = LogManager.getLogger(BookPage.class.getName());

    public BookPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'The Bitcoin Standard – The Decentralized Alternati')]")
    WebElement bookLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[1]/div[7]/div[14]/div[2]/div[2]/ul[1]/li[2]/span[1]/span[1]/span[1]/a[1]/span[2]/span[1]")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[1]/div[7]/div[4]/div[1]/span[3]/a[1]/span[1]")
    WebElement reviewCount;

    public void clickOnBookLink()
    {
        log.info("I click on the Book Link : " + bookLink.toString());
        clickOnElement(bookLink);
    }

    public void hardCoverPrice()  {
        log.info("I check the Hard cover price : " + price.toString());
        System.out.println(price.getText());
    }

    public void reviewCount()  {
        log.info("I check the review count: " + reviewCount.toString());
        System.out.println(reviewCount.getText());
    }
}
