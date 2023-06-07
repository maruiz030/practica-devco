package co.com.practicadevco.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login-scaf.feature",
        glue = "co.com.practicadevco.stepdefinitions")
public class LoginScafRunner {
}
