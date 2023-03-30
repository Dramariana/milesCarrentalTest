package co.com.milescarrental.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.targets.TargetAttribute;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static co.com.milescarrental.userinterfaces.MilesCarrentalHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Find implements Task {
    private String location;
    private String airoportName;

    private WebDriver webDriver;

    public Find(String locationAirport, String airoport, WebDriver driver) {
        location = locationAirport;
        airoportName = airoport;
        webDriver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement KEY = webDriver.findElement(By.className("key-search"));
        String keyNumber = KEY.getAttribute("value");
        String localizator = "pickupLocation" + keyNumber;
        actor.attemptsTo(Click.on(By.id(localizator)));

        actor.attemptsTo(Enter.theValue(location).into(By.id(localizator)));
        actor.attemptsTo(Click.on(By.xpath("//span[contains(text(),'"+airoportName+"')]")));


    }

    public static Find car(String locationAirport, String airport, WebDriver driver) {
        return instrumented(Find.class, locationAirport, airport, driver);

    }
}
