package co.com.unosquare.certification.unosquare.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/unosquare_web.feature",
        glue = "co.com.unosquare.certification.unosquare.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class UnosquareWeb {
}
