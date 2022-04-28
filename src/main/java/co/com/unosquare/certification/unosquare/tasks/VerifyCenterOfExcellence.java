package co.com.unosquare.certification.unosquare.tasks;

import co.com.unosquare.certification.unosquare.userinterfaces.NearshoreDevelomentPage;
import co.com.unosquare.certification.unosquare.userinterfaces.UnosquareHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;

public class VerifyCenterOfExcellence implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                MoveMouse.to(UnosquareHomePage.SERVICE_LIST),
                Click.on(UnosquareHomePage.NDS_OPTION),
                Scroll.to(NearshoreDevelomentPage.CENTER_EXCELLENCE_TEXT));

    }

    public static VerifyCenterOfExcellence text() {
        return Tasks.instrumented(VerifyCenterOfExcellence.class);
    }
}
