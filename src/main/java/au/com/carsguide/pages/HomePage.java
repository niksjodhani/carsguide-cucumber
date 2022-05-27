package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySell;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement used;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findADealer;




public void clickOnUsed(){
    clickOnElement(used);
}
    public void mouseHoverOnBuySell() {
        log.info("mouseHover on buy-sell"+buySell.getText());
        waitUntilVisibilityOfElementLocated(buySell,2);
        mouseHoverToElement(buySell);
    }

    public void clickOnSearchCars() {
        log.info("click on search cars"+searchCars.getText());
        waitUntilVisibilityOfElementLocated(searchCars,2);
        clickOnElement(searchCars);
    }
    public void clickOnFindADealer(){
    log.info(("click on find a dealer"+findADealer.getText()));

    clickOnElement(findADealer);
    }



}
