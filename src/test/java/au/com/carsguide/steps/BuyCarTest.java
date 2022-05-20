package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewUsedCarPage;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyCarTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab()  {
        new HomePage().clkBuySell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink()  {
        new HomePage().clkSearchCar();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }


    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) throws InterruptedException {
        new NewUsedCarPage().selectMake(make);
        Thread.sleep(2000);

    }


    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws InterruptedException {
        new NewUsedCarPage().selectModel(model);
        Thread.sleep(2000);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws InterruptedException {
        new NewUsedCarPage().selectLocation(location);
        Thread.sleep(2000);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws InterruptedException {
        new NewUsedCarPage().selectPrice(price);
        Thread.sleep(2000);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() throws InterruptedException {
        new NewUsedCarPage().clkOnFindMyNextCarBtn();
        Thread.sleep(2000);
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) throws InterruptedException {
        Assert.assertEquals("error",make.toUpperCase(),
                new ResultPage().verifyMake().toUpperCase());
        Thread.sleep(3000);

    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() throws InterruptedException {
        new HomePage().clkOnUsed();
        Thread.sleep(2000);
    }

    @Then("^I navigate to 'Used cars for sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
    }
}
