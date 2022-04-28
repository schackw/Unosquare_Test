package co.com.unosquare.certification.unosquare.tasks;

import co.com.unosquare.certification.unosquare.userinterfaces.ContactUsPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Fill implements Task {

    DataTable data;

    public Fill(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(data.cell(1,0)).into(ContactUsPage.CNUMBER_LABEL),
                Enter.theValue(data.cell(1,1)).into(ContactUsPage.TNUMBER_LABEL)
        );

    }
    public static Fill theFields(DataTable data) {
        return Tasks.instrumented(Fill.class,  data);
    }
}
