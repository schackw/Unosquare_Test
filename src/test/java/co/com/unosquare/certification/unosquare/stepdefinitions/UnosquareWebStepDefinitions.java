package co.com.unosquare.certification.unosquare.stepdefinitions;

import co.com.unosquare.certification.unosquare.tasks.Fill;
import co.com.unosquare.certification.unosquare.tasks.GoTo;
import co.com.unosquare.certification.unosquare.tasks.VerifyCenterOfExcellence;
import co.com.unosquare.certification.unosquare.userinterfaces.AboutPage;
import co.com.unosquare.certification.unosquare.userinterfaces.ContactUsPage;
import co.com.unosquare.certification.unosquare.userinterfaces.NearshoreDevelomentPage;
import co.com.unosquare.certification.unosquare.userinterfaces.UnosquareHomePage;
import co.com.unosquare.certification.unosquare.utils.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class UnosquareWebStepDefinitions {
    @Managed
    private WebDriver webDriver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User page");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    @Given("The user must be on the Unosquare web site home page.")
    public void theUserMustBeOnTheUnosquareWebSiteHomePage() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_UNOSQUARE));
    }

    @When("The user select the option")
    public void theUserSelectTheOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(MoveMouse.to(UnosquareHomePage.SERVICE_LIST));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(UnosquareHomePage.NDS_OPTION));
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(NearshoreDevelomentPage.CENTER_EXCELLENCE_TEXT));




    }

    @Then("The user must be in the Nearshore Development Services")
    public void theUserMustBeInTheNearshoreDevelopmentServices() {

        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(NearshoreDevelomentPage.FIRST_P).text().contains(Constants.FIRST_TEXT));

    }

    @When("The user be in the Nearshore Development Services")
    public void theUserBeInTheNearshoreDevelopmentServices() {
        OnStage.theActorInTheSpotlight().attemptsTo(VerifyCenterOfExcellence.text());
    }

    @And("The user go to the contact us section and select the submit botton")
    public void theUserGoToTheContactUsSectionAndSelectTheSubmitBotton() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(UnosquareHomePage.CONTACT_US_OPTION));
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(ContactUsPage.CONTACT_US_TEXT));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ContactUsPage.SUBMIT_BOTTOM));

    }

    @Then("The user will be see the message error")
    public void theUserWillBeSeeTheMessageError() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ContactUsPage.NAME_ERROR_MSG).text().contains(Constants.ERROR_MSG_NAME));
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ContactUsPage.EMAIL_ERROR_MSG).text().contains(Constants.EMAIL_MSG_NAME));

    }

    @Given("The user be in Contact us section")
    public void theUserBeInContactUsSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_UNOSQUARE));
        OnStage.theActorInTheSpotlight().attemptsTo(VerifyCenterOfExcellence.text());
        OnStage.theActorInTheSpotlight().attemptsTo(GoTo.contacUs());
    }

    @When("The enter the values in company numer and telephone number fields")
    public void theEnterTheValuesInCompanyNumerAndTelephoneNumberFields(DataTable data) {

        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theFields(data));
    }

    @When("The user select the about us option")
    public void theUserSelectTheAboutUsOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(UnosquareHomePage.ABOUT_OPTION));
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(AboutPage.PERSONAL_TITTLE_TEXT));
    }

    @Then("The user should see the Personal,Profesional and social tittle")
    public void theUserShouldSeeThePersonalProfesionalAndSocialTittle() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(AboutPage.PERSONAL_TITTLE_TEXT).text().contains(Constants.PERSONAL_TEXT));
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(AboutPage.PROFESSIONAL_TITTLE_TEXT).text().contains(Constants.PROFFESIONAL_TEXT));
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(AboutPage.SOCIAL_TITTLE_TEXT).text().contains(Constants.SOCIAL_TEXT));

    }
}
