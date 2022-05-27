package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import jdk.nashorn.internal.ir.WhileNode;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());

    public CarDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement pageTitleText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']/a")
    List<WebElement> dealersName;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextButton;

    public String getCarDealerPageText() {
        log.info("Get cars guide page text" + pageTitleText.getText());
        return getTextFromElement(pageTitleText);
    }

    public void clickOnNextButton() {
        log.info(("click on next button" + nextButton.getText()));
        clickOnElement(nextButton);
    }

    public String getDealerName(String data) {
        log.info("get Dealer Name :"+dealersName.toString());
        for (WebElement e : dealersName) {
            String str = e.getText();
            if (str.equalsIgnoreCase(data)) {
                return str;
            }
        }
    return null;
    }
}