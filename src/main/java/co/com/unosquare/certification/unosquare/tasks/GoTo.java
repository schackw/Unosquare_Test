package co.com.unosquare.certification.unosquare.tasks;

import co.com.unosquare.certification.unosquare.userinterfaces.ContactUsPage;
import co.com.unosquare.certification.unosquare.userinterfaces.UnosquareHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UnosquareHomePage.CONTACT_US_OPTION),
                Scroll.to(ContactUsPage.CONTACT_US_TEXT));


    }

    public static GoTo contacUs() {
        return Tasks.instrumented(GoTo.class);
    }
}
