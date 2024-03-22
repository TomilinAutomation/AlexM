package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

private final By card = By.xpath("//div[@class='cursor-pointer w-full h-full']");

    public RealtListingPage checkCountsCards(){
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard,34);
        return this;
    }


}
