package co.com.milescarrental.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindCar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static FindCar products() {
        return instrumented(GoTo.class);

    }
}
