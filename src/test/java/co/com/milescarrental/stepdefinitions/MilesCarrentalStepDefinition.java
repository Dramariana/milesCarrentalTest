package co.com.milescarrental.stepdefinitions;

import co.com.milescarrental.task.Find;
import co.com.milescarrental.userinterfaces.MilesCarrentalHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class MilesCarrentalStepDefinition {
    public static final int CURRENT_PRODUCT = 0;

    MilesCarrentalHomePage milesCarrentalHomePage;


    @Managed(driver = "firefox", uniqueSession = true)
    public WebDriver hisBrowser;
    private final Actor user = Actor.named("Mariana");


    @Before
    public void actorCanBrowseTheWeb() {
        user.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }



    @Given("user enters mileCarrental site")
    public void userEntersMileCarrentalSite() {
        user.wasAbleTo(Open.browserOn().the(milesCarrentalHomePage));

    }
    @Given("user find Location {string} Airport {string}")
    public void userFindLocationAirport(String  location, String airport) {
        user.attemptsTo(Find.car(location,airport,hisBrowser));

    }

    @Given("select pick up and drop off")
    public void selectPickUpAndDropOff() {

    }
    @When("user click search")
    public void userClickSearch() {

    }
    @When("select second card")
    public void selectSecondCard() {

    }
    @Then("user can complete driver information")
    public void userCanCompleteDriverInformation() {

    }
    @Then("user click next")
    public void userClickNext() {

    }


}
