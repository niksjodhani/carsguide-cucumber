package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUsedCarSearch extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public NewUsedCarSearch() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makes;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement models;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement pageTitleText;

    public String getPageTitleText() {
        return getTextFromElement(pageTitleText);
    }

    public void selectMakes(String make) {
        log.info("select makes from dropdown" + makes.getText());
        selectByVisibleTextFromDropDown(makes, make);
    }

    public void selectModels(String model) {
        log.info("select model from dropdown" + models.getText());
        selectByVisibleTextFromDropDown(models, model);
    }

    public void selectLocation(String locations) {
        log.info("select location from dropdwon" + location.getText());
        selectByVisibleTextFromDropDown(location, locations);
    }

    public void selectPrice(String prices) {
        log.info("select price from dropdown" + price.getText());
        selectByVisibleTextFromDropDown(price, prices);
    }

    public void clickOnSearchButton() {
        log.info("click on search button" + searchButton.getText());
       waitForElementWithFluentWait(searchButton,10,2);
        clickOnElement(searchButton);
    }

}
