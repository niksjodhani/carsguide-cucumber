package au.com.carsguide.steps;

import au.com.carsguide.pages.CarDealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Ca;
import org.junit.Assert;

import java.util.List;

public class CarDealerSteps {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealer();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals("Not navigated to dealer page", "Find a Car Dealership Near You", new CarDealerPage().getCarDealerPageText());
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dealersName) {
        List<String> expectedList = dealersName.asList(String.class);
        for (String data : expectedList) {

            System.out.println(new CarDealerPage().getDealerName(data));
            while (new CarDealerPage().getDealerName(data) == null) {
                new CarDealerPage().clickOnNextButton();
            }
                    Assert.assertEquals("Dealers not found", data, new CarDealerPage().getDealerName(data));


            }
        }
    }

