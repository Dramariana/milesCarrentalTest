package co.com.milescarrental.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://milescarrental.com/es/")
public class MilesCarrentalHomePage extends PageObject {

    public static final Target KEY = Target.the("key").located(By.className("key-search"));

    public static final Target FIRST_AIRPORT = Target.the("key").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[3]/ul[2]/li[1]/div[1]/span[2]"));
    public static final Target LOCATION = Target.the("location").located(By.id("pickupLocation20230329131477"));
    public static final Target PICK_UP = Target.the("pick_up").located(By.id("from-input20230329131477"));
    public static final Target PICK_OFF = Target.the("pick_off").located(By.id("input20230329131477"));
    public static final Target SEARCH_BUTTON = Target.the("search_button").located(By.id("btnQS20230329131477"));





}
